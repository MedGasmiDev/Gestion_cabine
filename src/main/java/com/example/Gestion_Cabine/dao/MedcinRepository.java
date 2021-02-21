package com.example.Gestion_Cabine.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.Gestion_Cabine.entite.Medecin;

@CrossOrigin("*")
@RepositoryRestResource
public interface MedcinRepository extends JpaRepository<Medecin, Long>{
	
	@RestResource(path = "/medByNom")
	public List<Medecin> findByNomContains(@Param("nom_med") String nom);
	
	@RestResource(path = "/medByNomPage")
	public Page<Medecin> findByNomContains(@Param("nom_med") String nom, Pageable pageable);

}
