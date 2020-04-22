package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.PersistenceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




import com.example.demo.entities.Carte;
import com.example.demo.entities.CarteDTO;
import com.example.demo.repository.CarteRepository;

@Service
@Transactional
public class CarteServieImp implements CarteService {


	@Autowired
	private CarteRepository carteRepository;
	
	
	@Override
	public Carte createCarte(Carte carte) {
		return carteRepository.save(carte);
	}

	@Override
	public List<Carte> createListCarte() {
		System.out.println( "Hello World! ines  createListCarte" );
	    String[] les_couleurs = {"coeur","trefle","pique","carreau"};
	    String[] les_valeurs = {"2","3","4","5","6","7","8","9","10","Valet","Dame","Rois","As"};
	    String couleur= "";
	    String valeur = "";
	   ArrayList<Carte> paquet = new ArrayList<Carte>();
	    
	     
	            for(int i=0;i<13;i++){
	                for(int j=0;j<4;j++){
	                   
						couleur = les_couleurs[j];
	                    valeur = les_valeurs[i]; 
	     
	                    paquet.add(new Carte(couleur,valeur)); 
	                }
	              
	            }


	            
	    
	
		return carteRepository.saveAll(paquet);
	}
	@Override
	public Carte updateCarte(Carte carte) {
		Optional<Carte> carteDb = this.carteRepository.findById(carte.getId());
		
		if(carteDb.isPresent()) {
			Carte carteUpdate = carteDb.get();
			carteUpdate.setId(carte.getId());
			carteUpdate.setCouleur(carte.getCouleur());
			carteUpdate.setValeur(carte.getValeur());
			carteRepository.save(carteUpdate);
			return carteUpdate;
		}else {
			throw new PersistenceException("Record not found with id : " + carte.getId());
		}		
	}

	@Override
	public List<Carte> getAllCarte() {
		System.out.println( "Hello World! ines" );
		return this.carteRepository.findAll();
	}

	@Override
	public Carte getCarteById(int carteId) {
		System.out.println( "Hello World! ines" );
		Optional<Carte> carteDb = this.carteRepository.findById(carteId);
		
		if(carteDb.isPresent()) {
			return carteDb.get();
		}else {
			throw new PersistenceException("Record not found with id : " + carteId);
		}
	}

	@Override
	public void deleteCarte(int carteId) {
		Optional<Carte> carteDb = this.carteRepository.findById(carteId);
		
		if(carteDb.isPresent()) {
			this.carteRepository.delete(carteDb.get());
		}else {
			throw new PersistenceException("Record not found with id : " + carteId);
		}
		
	}
	public List<CarteDTO> getAllCarteDTO() {
        List<Carte> list = carteRepository.findAll();
        List<CarteDTO> carteList = list.stream()
        	
            .map(CarteDTO::new)
            .collect(Collectors.toCollection(ArrayList::new));
        return carteList;
  }
	 private Carte convertDtoToModel(CarteDTO cartedto) {
         Carte car = new Carte();
         
        	 car.setId(cartedto.getId());
        
         car.setValeur(cartedto.getValeur());
         car.setCouleur(cartedto.getCouleur());
      
         return car;
   }

   private CarteDTO convertModelToDTO(Carte car) {
         CarteDTO carteDTO = new CarteDTO();
         carteDTO.setId(car.getId());
         carteDTO.setValeur(car.getValeur());
         carteDTO.setCouleur(car.getCouleur());
         
         return carteDTO;
   }
}