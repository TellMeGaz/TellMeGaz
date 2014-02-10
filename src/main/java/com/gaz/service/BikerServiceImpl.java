package com.gaz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gaz.dao.BikerDAO;
import com.gaz.model.Biker;


@Service
@Transactional
public class BikerServiceImpl implements BikerService {

	@Autowired
	private BikerDAO BikerDAO;

	public void addBiker(Biker Biker) {
		BikerDAO.addBiker(Biker);		
	}

	public void updateBiker(Biker Biker) {
		BikerDAO.updateBiker(Biker);
	}

	public Biker getBiker(int id) {
		return BikerDAO.getBiker(id);
	}
	
	public Biker getBiker(String email) {
		return BikerDAO.getBiker(email);
	}
	
	public Biker getBiker(String email,String password) {
		return BikerDAO.getBiker(email,password);
	}

	public void deleteBiker(int id) {
		BikerDAO.deleteBiker(id);
	}

	public List<Biker>  getBikers() {
		return BikerDAO.getBikers();
	}

	}

