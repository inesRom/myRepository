
package com.jeu.spring.service;	
import java.io.IOException;
import java.util.List;
import java.util.Set;

import com.jeu.hibernate.model.Carte;
public interface CarteService {
    public Carte getCarte(int id);
    public Carte getCarte(String id);
    public  Carte getListCarte(String valeur, String couleur);
    public Set<Carte> getAllCarte();
    public void saveAllCarte()throws IOException;
}