package com.jeuCarte.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jeuCarte.demo.model.Carte;
import com.jeuCarte.demo.service.CarteService;


@RestController
public class CarteController {

	@Autowired
	private CarteService carteService;
	
	@GetMapping("/cartes")
	public ResponseEntity<List<Carte>> getAllCarte(){
		return ResponseEntity.ok().body(carteService.getAllCarte());
	}
	
	@GetMapping("/cartes/{id}")
	public ResponseEntity<Carte> getCarteById(@PathVariable int id){
		return ResponseEntity.ok().body(carteService.getCarteById(id));
	}
	
	@PostMapping("/cartes")
	public ResponseEntity<Carte> createCarte(@RequestBody Carte carte){
		return ResponseEntity.ok().body(this.carteService.createCarte(carte));
	}
	
	@PutMapping("/cartes/{id}")
	public ResponseEntity<Carte> updateCartes(@PathVariable int id, @RequestBody Carte carte){
		carte.setId(id);
		return ResponseEntity.ok().body(this.carteService.updateCarte(carte));
	}

	@DeleteMapping("/cartes/{id}")
	public HttpStatus deleteCartes(@PathVariable int id){
		this.carteService.deleteCarte(id);
		return HttpStatus.OK;
	}
}