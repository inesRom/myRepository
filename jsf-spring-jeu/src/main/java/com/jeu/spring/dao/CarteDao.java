package com.jeu.spring.dao;


import java.util.List;
import com.jeu.hibernate.model.Carte;
public interface CarteDao {
    public Carte getcarte(int id);
    public List<Carte> getAllCarte();
}