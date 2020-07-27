package com.cranajit.security.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cranajit.security.model.User;

@Repository
@Transactional
public class UserRepository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public User addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
		return user;
	}
	
	public User findByUserName(String username) {
		Session session = sessionFactory.getCurrentSession();
		List<?> users = session.createQuery("FROM user WHERE user_name='"+username+"'").getResultList();
		if(users.size()>0) {
			return (User)users.get(0);
		}
		return null;
	}
}
