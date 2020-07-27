package com.cranajit.UMS.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JWTUtils {
	
	private final String SECRET_KEY = "UserManageMentSystem@1234$%";
	
	public String createToken(UserDetails userDetails) {
		Map<String, Object> claims = new HashMap<String, Object>();
		return generateToken(claims, userDetails.getUsername());
	}

	public String generateToken(Map<String, Object> claims, String username) {
		return Jwts.builder().addClaims(claims)
				.setSubject(username).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() * 1000*60*60*10))
				.signWith(SignatureAlgorithm.HS256, SECRET_KEY).compact();
	}
	
	public <T>T getClaims(String token, Function<Claims, T>claimSource) {
		Claims claims = getAllClaims(token);
		return claimSource.apply(claims);
	}

	public Claims getAllClaims(String token) {
		return Jwts.parser()
				.setSigningKey(SECRET_KEY)
				.parseClaimsJws(token)
				.getBody();
	}
	
	public String getUserName(String token) {
		return getClaims(token, Claims::getSubject);
	}
	
	public Date getExpireDate(String token) {
		return getClaims(token, Claims::getExpiration);
	}
	
	public Boolean validation(String token, UserDetails userDetails) {
		System.out.println("Username "+userDetails.getUsername());
		System.out.println("validation result: "+ (userDetails.getUsername().equals(getUserName(token)) &&
				!isExpired(token)));
		return userDetails.getUsername().equals(getUserName(token)) &&
				!isExpired(token);
	}
	
	public Boolean isExpired(String token) {
		return getExpireDate(token).before(new Date());
	}
}