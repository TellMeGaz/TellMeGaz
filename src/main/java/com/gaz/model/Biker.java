package com.gaz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "biker")
public class Biker {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String email;
	
	private String password;

	private String name;

	private Integer rating;

	/**
	 * Méthode renvoyant l'email du biker
	 * 
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Méthode permettant de renseigner l'email du biker
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Méthode renvoyant le password du biker
	 * 
	 * @return String
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Méthode permettant de renseigner le password du biker
	 * 
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Méthode renvoyant l'identifiant du biker
	 * 
	 * @return Integer
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Méthode permettant de renseigner l'identifiant du biker
	 * 
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Méthode renvoyant le nom du biker
	 * 
	 * @return String
	 */
	public String getName() {
		return name;
	}

	/**
	 * Méthode permettant de renseigner le nom du biker
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Méthode renvoyant la position du biker
	 * 
	 * @return Integer
	 */
	public Integer getRating() {
		return rating;
	}

	/**
	 * Méthode permettant de renseigner la position du biker
	 * 
	 * @param rating
	 */
	public void setRating(Integer rating) {
		this.rating = rating;
	}

}
