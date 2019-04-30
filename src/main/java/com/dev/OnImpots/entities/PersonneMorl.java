package com.dev.OnImpots.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import com.dev.OnImpots.dao.ContribuableRepository;
import com.dev.OnImpots.web.ContribuableService;
@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class PersonneMorl /*extends Contribuable*/ implements Serializable {
	
@Id String RegistreCommerce ;
String RaisonSocial;
Date DateDebutActivite;
String SecteurActivite;
String Activite;
Double ChiffreDaffaire;
public String getRegistreCommerce() {
	return RegistreCommerce;
}
public void setRegistreCommerce(String registreCommerce) {
	RegistreCommerce = registreCommerce;
}
public String getRaisonSocial() {
	return RaisonSocial;
}
public void setRaisonSocial(String raisonSocial) {
	RaisonSocial = raisonSocial;
}
public Date getDateDebutActivite() {
	return DateDebutActivite;
}
public void setDateDebutActivite(Date dateDebutActivite) {
	DateDebutActivite = dateDebutActivite;
}
public String getSecteurActivite() {
	return SecteurActivite;
}
public void setSecteurActivite(String secteurActivite) {
	SecteurActivite = secteurActivite;
}
public String getActivite() {
	return Activite;
}
public void setActivite(String activite) {
	Activite = activite;
}
public Double getChiffreDaffaire() {
	return ChiffreDaffaire;
}
public void setChiffreDaffaire(Double chiffreDaffaire) {
	ChiffreDaffaire = chiffreDaffaire;
}
public PersonneMorl() {
	super();
	// TODO Auto-generated constructor stub
}
public PersonneMorl(String registreCommerce, String raisonSocial, Date dateDebutActivite, String secteurActivite,
		String activite, Double chiffreDaffaire) {
	super();
	RegistreCommerce = registreCommerce;
	RaisonSocial = raisonSocial;
	DateDebutActivite = dateDebutActivite;
	SecteurActivite = secteurActivite;
	Activite = activite;
	ChiffreDaffaire = chiffreDaffaire;
}



}
