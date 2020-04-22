
package com.jeu.jsf.mbean;


import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import com.jeu.hibernate.model.Carte;
import com.jeu.spring.service.CarteService;
@ManagedBean
@ViewScoped
public class CarteMBean implements Serializable {
	private static final long serialVersionUID = 1L;
        //inject spring bean via DI
	@ManagedProperty("#{carteService}")
	private CarteService carteService;
	private Carte carte;
	private List<Carte> carteList;
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
	public List<Carte> getCarteList() {
		if (carteList == null) {
			carteList = carteService.getAllCarte();
		}
		return carteList;
	}
	public void setCarteList(List<Carte> carteList) {
		this.carteList = carteList;
	}
	public void setCarteService(CarteService carteService) {
		this.carteService = carteService;
	}
}