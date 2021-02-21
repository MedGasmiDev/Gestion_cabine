package com.example.Gestion_Cabine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Gestion_Cabine.dao.MedcinRepository;
import com.example.Gestion_Cabine.dao.PatientRepository;
import com.example.Gestion_Cabine.entite.Medecin;
import com.example.Gestion_Cabine.entite.Patient;

@SpringBootApplication
public class GestionCabineApplication implements CommandLineRunner {

	@Autowired
	private MedcinRepository medcinRepository;

	@Autowired
	private PatientRepository patientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(GestionCabineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Medecin m = new Medecin();
		Patient p = new Patient((long) 100, "med", "gasmi", 15, m);
		patientRepository.save(p);
		m.setAge(12);
		medcinRepository.save(m);
		System.err.println(m.getPatients());
	}

}
