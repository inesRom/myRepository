package com.ems.main.dto;

import javax.persistence.Column;

import com.ems.main.model.Carte;
import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;

public class CarteDTO {
	
	private Long id;
	private String couleur;
	private String valeur;
	private String base64;
	private byte[] imagec;
	

	
	public CarteDTO() {		
	}
	
	public CarteDTO(Long id, String couleur, byte[] imagec,String valeur ,String base64) {
	    this.id = id;
	    this.couleur = couleur;
	    this.valeur = valeur;
	    this.imagec = imagec;
	    this.base64 = base64;
	}	
	
	public CarteDTO(Carte carte) {
	    this.id = carte.getId();
	    this.couleur = carte.getCouleur();
	    this.valeur = carte.getValeur();
	    this.imagec = carte.getImagec();
	    this.base64 = carte.getBase64();
	}
//	public CarteDTO(String couleur, String valeur) {
//		this.couleur = couleur;
//		this.valeur = valeur;
//	}

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


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getBase64() {
	    //Convert the data type byte to String, store it in the variable and return it
	    return this.base64 = Base64.encode(this.imagec); 
	}

	public void setBase64(String base64) {
	    this.base64 = base64;
	}
	
	public byte[] getImagec() {
	    return this.imagec;
	}

	public void setImagec(byte[] imagec) {
	    this.imagec = imagec;
	}
}
