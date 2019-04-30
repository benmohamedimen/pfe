package com.dev.OnImpots.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class Administrateur /*extends Employee */implements Serializable{

	@Id String CodeAdmin;
	String Mission;
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Administrateur(String codeAdmin, String mission) {
		super();
		CodeAdmin = codeAdmin;
		Mission = mission;
	}

	public String getCodeAdmin() {
		return CodeAdmin;
	}
	public void setCodeAdmin(String codeAdmin) { 
		CodeAdmin = codeAdmin;
	}
	public String getMission() {
		return Mission;
	}
	public void setMission(String mission) {
		Mission = mission;
	}
	
	
}
