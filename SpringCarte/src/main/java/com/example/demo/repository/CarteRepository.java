package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Carte;

public interface CarteRepository extends JpaRepository<Carte, Integer>  {

}
