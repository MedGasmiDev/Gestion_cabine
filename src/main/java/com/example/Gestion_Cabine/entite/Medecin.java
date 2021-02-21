package com.example.Gestion_Cabine.entite;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="medecin") 
public class Medecin implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_med;
	private String nom;
	private String prenom;
	private int age;
	private int matricule;
	private String adress;
	
	@OneToMany(mappedBy="medecin", fetch = FetchType.LAZY)
    private Collection<Patient> Patients;

	public Medecin() {
		super();
	}

	public Medecin(long id_med, String nom, String prenom, int age, int matricule, String adress,
			Collection<Patient> patients) {
		super();
		this.id_med = id_med;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.matricule = matricule;
		this.adress = adress;
	}

	public long getId_med() {
		return id_med;
	}

	public void setId_med(long id_med) {
		this.id_med = id_med;
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

	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	public Collection<Patient> getPatients() {
		return Patients;
	}

	public void setPatients(Collection<Patient> patients) {
		Patients = patients;
	}

}
