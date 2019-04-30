package com.dev.OnImpots.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class Loyer /*extends ImpotsSociete */ implements Serializable{

	@Id int NumLoyer;
	String Adresse;
	Date DateDebutContrat;
	Date DateFinContrat;
	Double PrixBrut;
	public int getNumLoyer() {
		return NumLoyer;
	}
	public void setNumLoyer(int numLoyer) {
		NumLoyer = numLoyer;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public Date getDateDebutContrat() {
		return DateDebutContrat;
	}
	public void setDateDebutContrat(Date dateDebutContrat) {
		DateDebutContrat = dateDebutContrat;
	}
	public Date getDateFinContrat() {
		return DateFinContrat;
	}
	public void setDateFinContrat(Date dateFinContrat) {
		DateFinContrat = dateFinContrat;
	}
	public Double getPrixBrut() {
		return PrixBrut;
	}
	public void setPrixBrut(Double prixBrut) {
		PrixBrut = prixBrut;
	}
	public Loyer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Loyer(int numLoyer, String adresse, Date dateDebutContrat, Date dateFinContrat, Double prixBrut) {
		super();
		NumLoyer = numLoyer;
		Adresse = adresse;
		DateDebutContrat = dateDebutContrat;
		DateFinContrat = dateFinContrat;
		PrixBrut = prixBrut;
	}
	public void setNumLoyer(Long numLoyer2) {
		// TODO Auto-generated method stub
		
	}
	
	
}
