package com.gaz.service;

import java.util.List;

import com.gaz.model.Biker;

public interface BikerService {

	/**
	 * Méthode insérant un nouveau biker en base
	 * 
	 * @param Biker
	 */
	void addBiker(Biker Biker);

	/**
	 * Méthode permettant de mettre à jour un biker
	 * 
	 * @param Biker
	 */
	void updateBiker(Biker Biker);

	/**
	 * Méthode renvoyant un biker selectionné en base via son identifiant
	 * 
	 * @param id
	 * @return Biker
	 */
	Biker getBiker(int id);

	/**
	 * Méthode renvoyant un biker selectionné en base via son email
	 * 
	 * @param email
	 * @return Biker
	 */
	Biker getBiker(String email);

	/**
	 * Méthode renvoyant un biker selectionné en base via son email et son
	 * password
	 * 
	 * @param email
	 * @param password
	 * @return Biker
	 */
	Biker getBiker(String email, String password);

	/**
	 * Méthode permettant de supprimer un biker en base
	 * 
	 * @param id
	 */
	void deleteBiker(int id);

	/**
	 * Méthode renvoyant l'ensemble des bikers en base
	 * 
	 * @return List of Biker
	 */
	List<Biker> getBikers();

}
