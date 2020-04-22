package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carte")
public class Carte {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id ;
	
	@Column(name="valeur")
	private String valeur;
	
	public Carte(int id, String valeur, String couleur) {
		// TODO Auto-generated constructor stub
		this.id=id;
        this.couleur=couleur;
        this.valeur=valeur;
	}

	public Carte(String couleur2, String valeur2) {
		// TODO Auto-generated constructor stub
		 this.couleur=couleur2;
	        this.valeur=valeur2;
	}

	public Carte() {
		// TODO Auto-generated constructor stub
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		id = id;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Column(name="couleur")
	private String couleur;

}
