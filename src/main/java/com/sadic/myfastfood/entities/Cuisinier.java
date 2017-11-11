package com.sadic.myfastfood.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Cuisinier implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idCuisinier;
	@ManyToOne()
	@JoinColumn(name="id_employe", nullable=false)
	private Employe employe;
	@ManyToOne()
	@JoinColumn(name="id_cuisine", nullable=false)
	private Cuisine cuisine;
	
	public Cuisinier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cuisinier(Employe employe, Cuisine cuisine) {
		super();
		this.employe = employe;
		this.cuisine = cuisine;
	}
	public Long getIdCuisinier() {
		return idCuisinier;
	}
	public void setIdCuisinier(Long idCuisinier) {
		this.idCuisinier = idCuisinier;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Cuisine getCuisine() {
		return cuisine;
	}
	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}
	
}
