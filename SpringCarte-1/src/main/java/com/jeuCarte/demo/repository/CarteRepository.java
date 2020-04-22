package com.jeuCarte.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jeuCarte.demo.model.Carte;



public interface CarteRepository extends JpaRepository<Carte, Integer> {

}