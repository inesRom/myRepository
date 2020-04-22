
package com.jeu.spring.service;	
import java.util.List;
import com.jeu.hibernate.model.Carte;
public interface CarteService {
    public Carte getCarte(int id);
    public List<Carte> getAllCarte();
}