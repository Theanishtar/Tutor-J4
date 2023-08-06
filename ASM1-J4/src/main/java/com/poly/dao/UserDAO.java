package com.poly.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.poly.model.User;
import com.poly.jpautils.*;

public class UserDAO extends DAO<User, Long>{
	private EntityManager em = JPAUtils.getEntityManager();
	
	protected void finalize() throws Throwable{
		em.close();
		super.finalize();
	}

	@Override
	public void insert(User entity) {
		try {
			em.getTransaction().begin();
			em.persist(entity);
			em.getTransaction().commit();
		}
		catch(Exception ex) {
			em.getTransaction().rollback();	
		}
	}

	@Override
	public void delete(User entity) {
		try {
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			em.getTransaction().rollback();
		}
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAll() {
		String jpql = "SELECT u FROM User u";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		return query.getResultList();
	}
	
	public List<User> getUsers() {
		String jpql = "SELECT u FROM User u WHERE u.isAdmin = 0";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		return query.getResultList();
	}
	
	public User login(String email, String password) {
		try {
			String jpql = "SELECT u FROM User u WHERE u.email = :em AND u.password = :pw AND u.isActive = 1";
			TypedQuery<User> query = em.createQuery(jpql, User.class);
			query.setParameter("em", email);
			query.setParameter("pw", password);
			return query.getSingleResult();
		} catch (Exception e) {
			return null;
		}		
	}

	@Override
	public User findById(Long key) {
		String jpql = "SELECT u FROM User u WHERE u.userid = :id";
		TypedQuery<User> query = em.createQuery(jpql, User.class);
		query.setParameter("id", key);
		return query.getSingleResult();
	}

}
