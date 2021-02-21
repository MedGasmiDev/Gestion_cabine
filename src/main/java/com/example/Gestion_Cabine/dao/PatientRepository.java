package com.example.Gestion_Cabine.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.Gestion_Cabine.entite.Patient;

@CrossOrigin("*")
@RepositoryRestResource
public interface PatientRepository extends JpaRepository<Patient, Long>{
	
	@RestResource(path = "/PatientByNom")
	public List<Patient> findByNomContains(@Param("nom_Patient") String nom);
	
	@RestResource(path = "/PatientByNomPage")
	public Page<Patient> findByNomContains(@Param("nom_Patient") String nom, Pageable pageable);

}
