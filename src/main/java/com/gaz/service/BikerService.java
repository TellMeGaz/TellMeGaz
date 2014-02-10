package com.gaz.service;

import java.util.List;

import com.gaz.model.Biker;

public interface BikerService {
	

public void addBiker(Biker Biker);
public void updateBiker(Biker Biker);
public Biker getBiker(int id);
public Biker getBiker(String email);
public Biker getBiker(String email,String password);
public void deleteBiker(int id);
public List<Biker> getBikers();

}


