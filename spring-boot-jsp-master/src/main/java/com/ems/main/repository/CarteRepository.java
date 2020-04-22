package com.ems.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ems.main.model.Carte;

@Repository
public interface CarteRepository extends JpaRepository<Carte, Long>{

	void deleteById(Long id);
	
}
