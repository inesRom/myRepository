package com.example.demo.entities;

public class CarteDTO {
	private String valeur;
	private String couleur;
	private int id;
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public CarteDTO(String valeur, String couleur, int id) {
	
		this.valeur = valeur;
		this.couleur = couleur;
		this.id = id;
	}
	public CarteDTO(Carte carte) {
      
        this.valeur = carte.getValeur();
        this.couleur = carte.getCouleur();
        this.id = carte.getId();
    }
	public CarteDTO() {}

}
