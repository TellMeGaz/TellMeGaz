package com.gaz.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gaz.model.Biker;

@Repository
public interface BikerDAO {
	
public void addBiker(Biker Biker);
public void updateBiker(Biker Biker);
public Biker getBiker(int id);
public Biker getBiker(String email);
public void deleteBiker(int id);
public List getBikers();

}
