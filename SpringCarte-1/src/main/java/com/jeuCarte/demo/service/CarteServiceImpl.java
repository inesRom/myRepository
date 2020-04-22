package com.jeuCarte.demo.service;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeuCarte.demo.exception.ResourceNotFoundException;
import com.jeuCarte.demo.model.Carte;
import com.jeuCarte.demo.repository.CarteRepository;


@Service
@Transactional
public class CarteServiceImpl implements CarteService{

	
	@Autowired
	private CarteRepository carteRepository;
	
	
	@Override
	public Carte createCarte(Carte carte) {
		return carteRepository.save(carte);
	}

	@Override
	public Carte updateCarte(Carte carte) {
		Optional<Carte> carteDb = this.carteRepository.findById(carte.getId());
		
		if(carteDb.isPresent()) {
			Carte carteUpdate = carteDb.get();
			carteUpdate.setId(carte.getId());
			carteUpdate.setValeur(carte.getValeur());
			carteUpdate.setCouleur(carte.getCouleur());
			carteRepository.save(carteUpdate);
			return carteUpdate;
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + carte.getId());
		}		
	}

	@Override
	public List<Carte> getAllCarte() {
		return this.carteRepository.findAll();
	}

	@Override
	public Carte getCarteById(int carteId) {
		
		Optional<Carte> carteDb = this.carteRepository.findById(carteId);
		
		if(carteDb.isPresent()) {
			return carteDb.get();
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + carteId);
		}
	}

	@Override
	public void deleteCarte(int carteId) {
		Optional<Carte> carteDb = this.carteRepository.findById(carteId);
		
		if(carteDb.isPresent()) {
			this.carteRepository.delete(carteDb.get());
		}else {
			throw new ResourceNotFoundException("Record not found with id : " + carteId);
		}
		
	}

}