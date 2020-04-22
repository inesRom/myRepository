package com.ems.main.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ems.main.dto.CarteDTO;
import com.ems.main.model.Carte;
import com.ems.main.service.CarteService;


@Controller
public class CarteController {

	@Autowired
	private CarteService carteService;
	
	@GetMapping("/registration")
	public String reg(Map<String, Object> model) {
		model.put("carte", new CarteDTO());
		return "Registration";
	}
	
	@PostMapping("/home")
	public String createCarte(@ModelAttribute("carte") CarteDTO empDto) {
		carteService.createOrUpdateCarte(empDto);
		return "redirect:/list";	
	}
	
	@GetMapping("/list")
	public String listOfEmployee(Model model) {
		List<Carte> carteList = carteService.getAllCarte();
		
		model.addAttribute("carList", carteList);
		return "employeeList";
	}


	
	@PostMapping("/delete")
	public String deleteCarte(@RequestParam("id") String id) {
		carteService.deleteCarte(Long.parseLong(id));
		return "redirect:/list";		
	}
	
	@GetMapping("/edit")
	public String editCarte(@RequestParam("id") String id, Map<String, Object> model) {
		CarteDTO empDTO = carteService.editCarte(Long.parseLong(id));
		model.put("employee", empDTO);
		return "Registration";
	}
	
}
