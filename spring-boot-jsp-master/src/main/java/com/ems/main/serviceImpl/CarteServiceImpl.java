package com.ems.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.main.dto.CarteDTO;
import com.ems.main.model.Carte;
import com.ems.main.repository.CarteRepository;
import com.ems.main.service.CarteService;

@Service
public class CarteServiceImpl implements CarteService{
	
	@Autowired
	private CarteRepository carteRepository;

	public void createOrUpdateCarte(CarteDTO carDto) {
		Carte car = convertDtoToModel(carDto);
		carteRepository.save(car);
	}
	
//	public List<CarteDTO> getAllCarte() {
//		List<Carte> list = carteRepository.findAll();
//		List<CarteDTO> carteList = list.stream()
//	            .map(CarteDTO::new)
//	            .collect(Collectors.toCollection(ArrayList::new));
//		return carteList;
//	}
//	
	public List<Carte> getAllCarte() {
		List<Carte> list = carteRepository.findAll();
		
		return list;
	}
	
	public void deleteCarte(Long id) {
		carteRepository.deleteById(id);
	}
	
	public CarteDTO editCarte(Long id) {
		Carte car = carteRepository.getOne(id);
		return convertModelToDTO(car);
	}
	
	private Carte convertDtoToModel(CarteDTO carDto) {
		Carte car = new Carte();
		if (carDto.getId() != null) {
			car.setId(carDto.getId());
		}
		
		car.setValeur(carDto.getValeur());
		car.setCouleur(carDto.getCouleur());
		
		
		return car;
	}
	
	private CarteDTO convertModelToDTO(Carte car) {
		CarteDTO carDTO = new CarteDTO();
		carDTO.setId(car.getId());
		carDTO.setValeur(car.getValeur());
		carDTO.setCouleur(car.getCouleur());
		
		return carDTO;
	}
}
