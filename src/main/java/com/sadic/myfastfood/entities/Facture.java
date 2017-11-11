package com.sadic.myfastfood.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Facture implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long idFacture;
	private Long numero;
	private int quantite;
	private double prixUnitaire;
	private double prixTotal;
	private double total;
	@Temporal(TemporalType.DATE)
	private Date date;
	@ManyToOne()
	@JoinColumn(name="id_article", nullable=false)
	private Article article;
	@ManyToOne()
	@JoinColumn(name="id_commande", nullable=false)
	private Commande commande;
	
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Facture(Long numero, int quantite, double prixUnitaire, double prixTotal, double total, Date date,
			Article article, Commande commande) {
		super();
		this.numero = numero;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
		this.prixTotal = prixTotal;
		this.total = total;
		this.date = date;
		this.article = article;
		this.commande = commande;
	}

	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
}
