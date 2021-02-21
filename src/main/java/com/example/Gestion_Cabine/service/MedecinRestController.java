package com.example.Gestion_Cabine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Gestion_Cabine.dao.MedcinRepository;
import com.example.Gestion_Cabine.entite.Medecin;

@RestController
public class MedecinRestController {
	@Autowired
	private MedcinRepository medcinRepository;
	
	@GetMapping(value="/ListeMedecins")
	public List<Medecin> ListMedecin(){
		return medcinRepository.findAll();
	}

	@GetMapping(value="/ListeMedecins/{id}")
	public Medecin ListMedecin(@PathVariable(name="id") Long id_med){
		return medcinRepository.findById(id_med).get();
	}

	@PutMapping(value="/ListeMedecins/{id}")
	public Medecin update(@PathVariable(name="id") Long id_med, @RequestBody Medecin m){
		m.setId_med(id_med);
		return medcinRepository.save(m);
	}
	
	@PostMapping(value="/ListeMedecins")
	public Medecin save(@RequestBody Medecin m){
		return medcinRepository.save(m);
	}
	
	@DeleteMapping(value="/ListeMedecins")
	public void save(@PathVariable(name="id") Long id_med){
		medcinRepository.deleteById(id_med);
	}
}
