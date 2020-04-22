package com.ems.main.model;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name ="carte")
public class Carte implements java.io.Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="couleur")
	private String couleur;
	
	@Column(name="valeur")
	private String valeur;
	
	@Column(name="imagec")
	private byte[] imagec;
	@Transient
	private String base64; //Variable to store the conversion of a data byte type to String

	public Carte() {
	}

	public Carte(Long id, String couleur, byte[] imagec,String valeur ,String base64) {
	    this.id = id;
	    this.couleur = couleur;
	    this.valeur = valeur;
	    this.imagec = this.imagec;
	    this.base64 = this.base64;
	}

	@Transient //Annotation so it does not persist in the database
	public String getBase64() {
	    //Convert the data type byte to String, store it in the variable and return it
	    return this.base64 = Base64.encode(this.imagec); 
	}

	public void setBase64(String base64) {
	    this.base64 = base64;
	}

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getValeur() {
		return valeur;
	}

	public void setValeur(String valeur) {
		this.valeur = valeur;
	}

	
	@Column(name = "imagec")
	public byte[] getImagec() {
	    return this.imagec;
	}

	public void setImagec(byte[] imagec) {
	    this.imagec = imagec;
	}




}
