package com.gaz.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gaz.model.Biker;

@Repository
public class BikerDAOImpl implements BikerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	public void addBiker(Biker Biker) {
		getCurrentSession().save(Biker);
	}

	public void updateBiker(Biker Biker) {
		Biker BikerToUpdate = getBiker(Biker.getId());
		BikerToUpdate.setName(Biker.getName());
		BikerToUpdate.setRating(Biker.getRating());
		getCurrentSession().update(BikerToUpdate);

	}

	public Biker getBiker(int id) {
		Biker Biker = (Biker) getCurrentSession().get(Biker.class, id);
		return Biker;
	}
	
	public Biker getBiker(String email) {
		org.hibernate.Query query=  getCurrentSession().createQuery("from Biker where email=:email");
		query.setParameter("email", email);
		List<Biker> list=query.list();
		if (list.size()==0) {
			return null;
		} else return list.get(0);
	}

	
	public Biker getBiker(String email, String password) {
		Biker biker = getBiker(email);

		if (biker != null) {
			if (biker.getPassword().equals(password)) {
				return biker;
			}

		}
		return null;

	}

	public void deleteBiker(int id) {
		Biker Biker = getBiker(id);
		if (Biker != null)
			getCurrentSession().delete(Biker);
	}

	public List<Biker> getBikers() {
		return getCurrentSession().createQuery("from Biker").list();
	}

}