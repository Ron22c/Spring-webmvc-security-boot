package com.cranajit.books.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cranajit.books.models.User;

@Component
@Transactional
public class UserDAOImp implements UserDAO {

	@Autowired
	private SessionFactory factory;

	@Override
	public long save(User user) {
		factory.getCurrentSession().save(user);
		return user.getUserId();
	}

	@Override
	public User get(long id) {
		return factory.getCurrentSession().get(User.class, id);
	}

	@Override
	public List<User> list() {
		Session session = factory.getCurrentSession();
		CriteriaBuilder cb = session.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> root = cq.from(User.class);
		cq.select(root);
		Query<User> query = session.createQuery(cq);
		return query.getResultList();
	}

	@Override
	public void update(long id, User user) {
		Session session = factory.getCurrentSession();
		User user2 = session.byId(User.class).load(id);
		user2.setUserName(user.getUserName());
		user2.setEmail(user.getEmail());
		session.flush();
	}

	@Override
	public void delete(long id) {
		Session session = factory.getCurrentSession();
		User user = session.byId(User.class).load(id);
		session.delete(user);
	}

}
