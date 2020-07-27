package com.cranajit.streammusic.daos;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cranajit.streammusic.models.User;

@Component
@Transactional
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SessionFactory factory;
	
	@Override
	public User getUser(long id) {
		return factory.getCurrentSession().get(User.class, id);
	}

	@Override
	public List<User> getUsers() {
		Session session = factory.getCurrentSession();
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
		Root<User> root = criteriaQuery.from(User.class);
		criteriaQuery.select(root);
		Query<User> query = session.createQuery(criteriaQuery);
		List<User> userList = query.getResultList();
		return userList;
	}

	@Override
	public User addUser(User user) {
		factory.getCurrentSession().save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		Session session = factory.getCurrentSession();
		User userOne = session.get(User.class, user.getId());
		userOne.setId(user.getId());
		userOne.setFirstName(user.getFirstName());
		userOne.setLastName(user.getLastName());
		userOne.setPhone(user.getPhone());
		userOne.setCountry(user.getCountry());
		userOne.setLanguages(user.getLanguages());
		userOne.setEmail(user.getEmail());
		userOne.setGender(user.getGender());
		session.update(userOne);
		return userOne;
	}

	@Override
	public long deleteUser(long id) {
		Session session = factory.getCurrentSession();
		User user = session.get(User.class, id);
		session.delete(user);
		return user.getId();
	}

}
