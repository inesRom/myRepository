package com.jeuCarte.demo.service;


import java.util.List;

import com.jeuCarte.demo.model.Carte;


public interface CarteService {
	Carte createCarte(Carte carte);

	Carte updateCarte(Carte carte);

	List<Carte> getAllCarte();

	Carte getCarteById(int carteId);

	void deleteCarte(int id);
}