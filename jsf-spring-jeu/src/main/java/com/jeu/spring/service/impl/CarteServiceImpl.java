package com.jeu.spring.service.impl;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.jeu.hibernate.model.Carte;
import com.jeu.spring.dao.CarteDao;
import com.jeu.spring.service.CarteService;
public class CarteServiceImpl implements CarteService {
    @Autowired
    private CarteDao carteDao;
    @Override
    public Carte getCarte(int id) {
        return carteDao.getcarte(id);
    }
    @Override
    public List<Carte> getAllCarte() {
        return carteDao.getAllCarte();
    }
    public CarteDao getCarteDao() {
        return carteDao;
    }
}