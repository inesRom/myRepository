package com.jeu.spring.service.impl;



import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeu.hibernate.model.Carte;

import com.jeu.spring.dao.CarteDao;
import com.jeu.spring.service.CarteService;
@Transactional
@Service(value="carteService")
public class CarteServiceImpl implements CarteService {
    @Autowired
    private CarteDao carteDao;
    @Override
    public Carte getCarte(int id) {
        return carteDao.getcarte(id);
    }
    @Override
    public Set<Carte> getAllCarte() {
        return carteDao.getAllCarte();
    }
   
    public CarteDao getCarteDao() {
        return carteDao;
    }
	@Override
	public void saveAllCarte() throws IOException {
		 carteDao.saveAllCarte();
		
	}
	@Override
	public Carte getCarte(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Carte getListCarte(String valeur, String couleur) {
		  return carteDao.getListCarte(valeur, couleur);
	}
}
