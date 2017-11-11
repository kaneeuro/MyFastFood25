package com.sadic.myfastfood.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comptable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idComptable;
	@ManyToOne()
	@JoinColumn(name="id_employe", nullable=false)
	private Employe employe;
	public Comptable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comptable(Employe employe) {
		super();
		this.employe = employe;
	}
	public Long getIdComptable() {
		return idComptable;
	}
	public void setIdComptable(Long idComptable) {
		this.idComptable = idComptable;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	
}
