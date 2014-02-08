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
		Biker Biker = (Biker) getCurrentSession().get(Biker.class, email);
		return Biker;
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