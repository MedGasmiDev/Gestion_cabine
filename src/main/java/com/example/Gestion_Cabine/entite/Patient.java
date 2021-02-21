package com.example.Gestion_Cabine.entite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient") 
public class Patient implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_patient;
	private String nom;
	private String prenom;
	private int age;
	private Medecin medecin;
	
	public Patient(Long id_patient, String nom, String prenom, int age, Medecin medecin) {
		super();
		this.id_patient = id_patient;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.medecin = medecin;
	}

	public Long getId_patient() {
		return id_patient;
	}

	public void setId_patient(Long id_patient) {
		this.id_patient = id_patient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	

}
