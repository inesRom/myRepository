
package com.jeu.jsf.mbean;


import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import com.jeu.hibernate.model.Carte;
import com.jeu.spring.service.CarteService;
import org.apache.log4j.Logger;

@ManagedBean
@ViewScoped
public class CarteMBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = "success";
	private static final String ERROR = "error";
	final private Logger logger = Logger.getLogger(getClass().getName());
        //inject spring bean via DI
	@ManagedProperty("#{carteService}")
	private CarteService carteService;
	private Carte carte;
	private Set<Carte> carteList;
	
	public Carte getCarte() {
		if (carte == null) {
			int id = 7;// should come from UI
			carte = carteService.getCarte(id);
		}
		return carte;
	}
	public void setCarte(Carte carte) {
		this.carte = carte;
	}
	public Set <Carte> getCarteList() {
		 logger.debug("==Debut de getCarteList==");
		if (carteList == null) {
    		carteList = carteService.getAllCarte();
    		 logger.debug("==Fin de getCarteList==");
		}
		return carteList;
	}
	public void setCarteList(Set<Carte> carteList) {
		this.carteList = carteList;
	}
	public String addCarteList() {
		 logger.debug("==Debut de getCarteList==");
		try {
			carteService.saveAllCarte();
			 logger.debug("==Fin de getCarteList==");
			return SUCCESS;
		} catch (IOException e) {
			
			logger.error( e.getMessage());
		}
		 logger.debug("==Fin de getCarteList==");
	return ERROR;
	
	}
	public void setCarteService(CarteService carteService) {
		this.carteService = carteService;
	}
}