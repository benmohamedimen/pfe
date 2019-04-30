package com.dev.OnImpots.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.dev.OnImpots.dao.PersonnePhyzRepository;
@Entity
//@Inheritance(strategy=InheritanceType.table_per_class)
public class Employee /*extends PersonnePhyz */implements Serializable{

	
@Id	int Num_Employe;
	String Poste;
	Date DateDebutService;
	Date DateFinService;
	Double SalaireBrut;
	Double PrivilegeNature;
	Double TotalRevenuBrutImposable;
	Double RevenuInvesti;
	Double MontantReduits;
	Double MontantNetPaye;
	
	public int getNum_Employe() {
		return Num_Employe;
	}

	public void setNum_Employe(int num_Employe) {
		Num_Employe = num_Employe;
	}

	public String getPoste() {
		return Poste;
	}

	public void setPoste(String poste) {
		Poste = poste;
	}

	public Date getDateDebutService() {
		return DateDebutService;
	}

	public void setDateDebutService(Date dateDebutService) {
		DateDebutService = dateDebutService;
	}

	public Date getDateFinService() {
		return DateFinService;
	}

	public void setDateFinService(Date dateFinService) {
		DateFinService = dateFinService;
	}

	public Double getSalaireBrut() {
		return SalaireBrut;
	}

	public void setSalaireBrut(Double salaireBrut) {
		SalaireBrut = salaireBrut;
	}


	public Double getTotalRevenuBrutImposable() {
		return TotalRevenuBrutImposable;
	}

	public void setTotalRevenuBrutImposable(Double totalRevenuBrutImposable) {
		TotalRevenuBrutImposable = totalRevenuBrutImposable;
	}

	public Double getRevenuInvesti() {
		return RevenuInvesti;
	}

	public void setRevenuInvesti(Double revenuInvesti) {
		RevenuInvesti = revenuInvesti;
	}

	public Double getMontantReduits() {
		return MontantReduits;
	}

	public void setMontantReduits(Double montantReduits) {
		MontantReduits = montantReduits;
	}

	public Double getMontantNetPaye() {
		return MontantNetPaye;
	}

	public void setMontantNetPaye(Double montantNetPaye) {
		MontantNetPaye = montantNetPaye;
	}


	public Double getPrivilegeNature() {
		return PrivilegeNature;
	}

	public void setPrivilegeNature(Double privilegeNature) {
		PrivilegeNature = privilegeNature;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int num_Employe, String poste, Date dateDebutService, Date dateFinService, Double salaireBrut,
			Double privilegeNature, Double totalRevenuBrutImposable, Double revenuInvesti, Double montantReduits,
			Double montantNetPaye) {
		super();
		Num_Employe = num_Employe;
		Poste = poste;
		DateDebutService = dateDebutService;
		DateFinService = dateFinService;
		SalaireBrut = salaireBrut;
		PrivilegeNature = privilegeNature;
		TotalRevenuBrutImposable = totalRevenuBrutImposable;
		RevenuInvesti = revenuInvesti;
		MontantReduits = montantReduits;
		MontantNetPaye = montantNetPaye;
	}

	
	

}
