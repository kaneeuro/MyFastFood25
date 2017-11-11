package com.sadic.myfastfood.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Serveur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idServeur;
	@ManyToOne()
	@JoinColumn(name="id_employe", nullable=false)
	private Employe employe;
	
	public Serveur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Serveur(Employe employe) {
		super();
		this.employe = employe;
	}
	public Long getIdServeur() {
		return idServeur;
	}
	public void setIdServeur(Long idServeur) {
		this.idServeur = idServeur;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
}
