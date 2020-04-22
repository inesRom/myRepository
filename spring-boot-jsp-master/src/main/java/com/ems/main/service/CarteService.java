package com.ems.main.service;

import java.util.List;

import com.ems.main.dto.CarteDTO;
import com.ems.main.model.Carte;


public interface CarteService {

	public void createOrUpdateCarte(CarteDTO carDTO);
	
	public List<Carte> getAllCarte();
	
	public void deleteCarte(Long id);
	
	public CarteDTO editCarte(Long id);
	
}
