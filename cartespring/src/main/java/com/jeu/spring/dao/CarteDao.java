package com.jeu.spring.dao;


import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.jeu.hibernate.model.Carte;
public interface CarteDao {
    public Carte getcarte(int id);
    public Set<Carte> getAllCarte();
    public  void saveAllCarte()throws IOException;
    public  Carte getListCarte(String valeur, String couleur);
}