package com.jeu.hibernate.model;



import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.transaction.annotation.Transactional;

import com.jeu.spring.service.CarteService;






@SuppressWarnings("unused")
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional

@ContextConfiguration({ "file:src/main/webapp/WEB-INF/applicationContext.xml" }  )

public class CarteTest {
	   @Autowired
	    private CarteService carteService;

	 @Test
	    public void shouldFindCartesById() {
		 Carte carte = carteService.getCarte(480);
	         
	        Assert.assertNotNull(carte);
	        Assert.assertEquals("rrrtt", carte.getCouleur());
	        Assert.assertEquals("rrr", carte.getValeur());
	 }
	        @Test
		    public void shouldFindCarteByCouleurValeur() {
			 Carte carte = carteService.getListCarte("as", "pique");
		         
		        Assert.assertNotNull(carte);
	        }
		        @Test
			    public void shouldFindAllCarte() {
				Set <Carte> carte = carteService.getAllCarte();
			         
			        Assert.assertNotNull(carte);
	 }

}
