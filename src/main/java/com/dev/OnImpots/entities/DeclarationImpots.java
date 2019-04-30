package com.dev.OnImpots.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.OneToMany;
@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class DeclarationImpots implements Serializable {
 @Id String IdDeclarationImpots ; 
 String TypeDeclarationImpots;
 String Obligation;
 Date DateDeclarationImpots;
 @OneToMany(mappedBy="CodeEx")
public String getIdDeclarationImpots() {
	return IdDeclarationImpots;
}
public void setIdDeclarationImpots(String idDeclarationImpots) {
	IdDeclarationImpots = idDeclarationImpots;
}
public String getTypeDeclarationImpots() {
	return TypeDeclarationImpots;
}
public void setTypeDeclarationImpots(String typeDeclarationImpots) {
	TypeDeclarationImpots = typeDeclarationImpots;
}
public String getObligation() {
	return Obligation;
}
public void setObligation(String obligation) {
	Obligation = obligation;
}
public Date getDateDeclarationImpots() {
	return DateDeclarationImpots;
}
public void setDateDeclarationImpots(Date dateDeclarationImpots) {
	DateDeclarationImpots = dateDeclarationImpots;
}
public DeclarationImpots() {
	super();
	// TODO Auto-generated constructor stub
}
public DeclarationImpots(String idDeclarationImpots, String typeDeclarationImpots, String obligation,
		Date dateDeclarationImpots) {
	super();
	IdDeclarationImpots = idDeclarationImpots;
	TypeDeclarationImpots = typeDeclarationImpots;
	Obligation = obligation;
	DateDeclarationImpots = dateDeclarationImpots;
}
 
 
 
}
