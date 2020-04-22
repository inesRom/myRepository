package com.example.demo.service;
import java.util.List;

import com.example.demo.entities.Carte;
import com.example.demo.entities.CarteDTO;



public interface CarteService {

    Carte createCarte(Carte carte);
 

	Carte updateCarte(Carte carte);

	List<Carte> getAllCarte();

	Carte getCarteById(int carteId);

	void deleteCarte(int id);
	
	  List<Carte> createListCarte();

      public List<CarteDTO> getAllCarteDTO();
}