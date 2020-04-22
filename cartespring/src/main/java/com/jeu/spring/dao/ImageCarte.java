package com.jeu.spring.dao;

public enum ImageCarte {

	 //Objets directement construits  C:/Users/33769/Desktop/damekarro.png
	//COEUR
	  COEUR_2("2", "coeur","C:/SpringWorkSpace/cartespring/deuCoeur.png"),
	  COEUR_3("3", "coeur","C:/SpringWorkSpace/cartespring/troisCoeur.png"),
	  COEUR_4("4", "coeur","C:/SpringWorkSpace/cartespring/quatreCoeur.png"),
	  COEUR_5("5", "coeur","C:/SpringWorkSpace/cartespring/cinqCouer.png"),
	  COEUR_6("6", "coeur","C:/SpringWorkSpace/cartespring/sixcoeur.png"),
	  COEUR_7("7", "coeur","C:/SpringWorkSpace/cartespring/septcoeur.png"),
	  COEUR_8("8", "coeur","C:/SpringWorkSpace/cartespring/huitcoeur.png"),
	  COEUR_9("9", "coeur","C:/SpringWorkSpace/cartespring/neufCoeur.png"),
	  COEUR_10("10", "coeur","C:/SpringWorkSpace/cartespring/dixCoeur.png"),
	  COEUR_VALET("Valet", "coeur","C:/SpringWorkSpace/cartespring/valetcoeur.png"),
	  COEUR_DAME("Dame", "coeur","C:/SpringWorkSpace/cartespring/dameCouer.png"),
	  COEUR_ROIS("Rois", "coeur","C:/SpringWorkSpace/cartespring/roicoeur.png"),
	  COEUR_AS("As", "coeur","C:/SpringWorkSpace/cartespring/asCoeur.png"),
	//TREFLE
	  TREFLE_2("2", "trefle","C:/SpringWorkSpace/cartespring/deuTrefles.png"),
	  TREFLE_3("3", "trefle","C:/SpringWorkSpace/cartespring/troisTrefle.png"),
	  TREFLE_4("4", "trefle","C:/SpringWorkSpace/cartespring/quatresTrefle.png"),
	  TREFLE_5("5", "trefle","C:/SpringWorkSpace/cartespring/cinqTrefle.png"),
	  TREFLE_6("6", "trefle","C:/SpringWorkSpace/cartespring/sixtrefle.png"),
	  TREFLE_7("7", "trefle","C:/SpringWorkSpace/cartespring/septTrefle.png"),
	  TREFLE_8("8", "trefle","C:/SpringWorkSpace/cartespring/huitTrefle.png"),
	  TREFLE_9("9", "trefle","C:/SpringWorkSpace/cartespring/neufTrefle.png"),
	  TREFLE_10("10", "trefle","C:/SpringWorkSpace/cartespring/dixtrefel.png"),
	  TREFLE_VALET("Valet", "trefle","C:/SpringWorkSpace/cartespring/valettrefel.png"),
	  TREFLE_DAME("Dame", "trefle","C:/SpringWorkSpace/cartespring/dametrefle.png"),
	  TREFLE_ROIS("Rois", "trefle","C:/SpringWorkSpace/cartespring/roitrefle.png"),
	  TREFLE_AS("As", "trefle","C:/SpringWorkSpace/cartespring/astrefle.png"),
//	  Pique
	  PIQUE_2("2", "pique","C:/SpringWorkSpace/cartespring/deuPique.png"),
	  PIQUE_3("3", "pique","C:/SpringWorkSpace/cartespring/troisPique.png"),
	  PIQUE_4("4", "pique","C:/SpringWorkSpace/cartespring/quatresPique.png"),
	  PIQUE_5("5", "pique","C:/SpringWorkSpace/cartespring/cinqPique.png"),
	  PIQUE_6("6", "pique","C:/SpringWorkSpace/cartespring/sixpique.png"),
	  PIQUE_7("7", "pique","C:/SpringWorkSpace/cartespring/septpique.png"),
	  PIQUE_8("8", "pique","C:/SpringWorkSpace/cartespring/pique8.png"),
	  PIQUE_9("9", "pique","C:/SpringWorkSpace/cartespring/neufPique.png"),
	  PIQUE_10("10", "pique","C:/SpringWorkSpace/cartespring/dixPique.png"),
	  PIQUE_VALET("Valet", "pique","C:/SpringWorkSpace/cartespring/valetpique.png"),
	  PIQUE_DAME("Dame", "pique","C:/SpringWorkSpace/cartespring/damePique.png"),
	  PIQUE_ROIS("Rois", "pique","C:/SpringWorkSpace/cartespring/roiPique.png"),
	  PIQUE_AS("As", "pique","C:/SpringWorkSpace/cartespring/asPique.png"),
//	  CARREAU
	  
	  CARREAU_2("2", "carreau","C:/SpringWorkSpace/cartespring/deukaro.png"),
	  CARREAU_3("3", "carreau","C:/SpringWorkSpace/cartespring/troiskaro.png"),
	  CARREAU_4("4", "carreau","C:/SpringWorkSpace/cartespring/quatresKarro.png"),
	  CARREAU_5("5", "carreau","C:/SpringWorkSpace/cartespring/cinqCarreu.png"),
	  CARREAU_6("6", "carreau","C:/SpringWorkSpace/cartespring/sixkarro.png"),
	  CARREAU_7("7", "carreau","C:/SpringWorkSpace/cartespring/Septkaro.png"),
	  CARREAU_8("8", "carreau","C:/SpringWorkSpace/cartespring/huitKarro.png"),
	  CARREAU_9("9", "carreau","C:/SpringWorkSpace/cartespring/neufkarro.png"),
	  CARREAU_10("10", "carreau","C:/SpringWorkSpace/cartespring/dixkarro.png"),
	  CARREAU_VALET("Valet", "carreau","C:/SpringWorkSpace/cartespring/valetkaro.png"),
	  CARREAU_DAME("Dame", "carreau","C:/SpringWorkSpace/cartespring/damekarro.png"),
	  CARREAU_ROIS("Rois", "carreau","C:/SpringWorkSpace/cartespring/roicarreo.png"),
	  CARREAU_AS("As", "carreau","C:/SpringWorkSpace/cartespring/asCaroN.png");
	 	
	  private String valeur = "";
	  private String couleur = "";
	  private String pathImage = ""; 
	  //Constructeur
	  ImageCarte(String valeur, String couleur,String pathImage){
	    this.valeur = valeur;
	    this.couleur = couleur;
	    this.pathImage = pathImage;
	  }
	  @Override
	    public String toString() {
	        return valeur + couleur + pathImage ;
	    }
	     
	    public String getValeur() {
	        return valeur;
	    }
	    public String getCouleur() {
	        return couleur;
	    }
	    public String getPathImage() {
	        return pathImage;
	    }
	    
}
