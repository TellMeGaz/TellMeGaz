package com.gaz.service;

import java.util.List;

import com.gaz.model.Biker;

public interface BikerService {

	/**
	 * M�thode ins�rant un nouveau biker en base
	 * 
	 * @param Biker
	 */
	void addBiker(Biker Biker);

	/**
	 * M�thode permettant de mettre � jour un biker
	 * 
	 * @param Biker
	 */
	void updateBiker(Biker Biker);

	/**
	 * M�thode renvoyant un biker selectionn� en base via son identifiant
	 * 
	 * @param id
	 * @return Biker
	 */
	Biker getBiker(int id);

	/**
	 * M�thode renvoyant un biker selectionn� en base via son email
	 * 
	 * @param email
	 * @return Biker
	 */
	Biker getBiker(String email);

	/**
	 * M�thode renvoyant un biker selectionn� en base via son email et son
	 * password
	 * 
	 * @param email
	 * @param password
	 * @return Biker
	 */
	Biker getBiker(String email, String password);

	/**
	 * M�thode permettant de supprimer un biker en base
	 * 
	 * @param id
	 */
	void deleteBiker(int id);

	/**
	 * M�thode renvoyant l'ensemble des bikers en base
	 * 
	 * @return List of Biker
	 */
	List<Biker> getBikers();

}
