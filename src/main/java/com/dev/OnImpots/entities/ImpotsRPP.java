package com.dev.OnImpots.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class ImpotsRPP /*extends DeclarationImpots */implements Serializable {
@Id Long ImpotsRPPId;
	Double BeneficeCommerciauxIndustriels;
	Double BeneficeProfessionNonCommercial;
	Double BeneficeActiviteAgricole;
	Double RevenuImmobiliers;
	public Long getImpotsRPPId() {
		return ImpotsRPPId;
	}
	public void setImpotsRPPId(Long impotsRPPId) {
		ImpotsRPPId = impotsRPPId;
	}
	Double AutreFraisHonoraires;
	public Double getBeneficeCommerciauxIndustriels() {
		return BeneficeCommerciauxIndustriels;
	}
	public void setBeneficeCommerciauxIndustriels(Double beneficeCommerciauxIndustriels) {
		BeneficeCommerciauxIndustriels = beneficeCommerciauxIndustriels;
	}
	public Double getBeneficeProfessionNonCommercial() {
		return BeneficeProfessionNonCommercial;
	}
	public void setBeneficeProfessionNonCommercial(Double beneficeProfessionNonCommercial) {
		BeneficeProfessionNonCommercial = beneficeProfessionNonCommercial;
	}
	public Double getBeneficeActiviteAgricole() {
		return BeneficeActiviteAgricole;
	}
	public void setBeneficeActiviteAgricole(Double beneficeActiviteAgricole) {
		BeneficeActiviteAgricole = beneficeActiviteAgricole;
	}
	public Double getRevenuImmobiliers() {
		return RevenuImmobiliers;
	}
	public void setRevenuImmobiliers(Double revenuImmobiliers) {
		RevenuImmobiliers = revenuImmobiliers;
	}
	public Double getAutreFraisHonoraires() {
		return AutreFraisHonoraires;
	}
	public void setAutreFraisHonoraires(Double autreFraisHonoraires) {
		AutreFraisHonoraires = autreFraisHonoraires;
	}
	public ImpotsRPP() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ImpotsRPP(Double beneficeCommerciauxIndustriels, Double beneficeProfessionNonCommercial,
			Double beneficeActiviteAgricole, Double revenuImmobiliers, Double autreFraisHonoraires) {
		super();
		BeneficeCommerciauxIndustriels = beneficeCommerciauxIndustriels;
		BeneficeProfessionNonCommercial = beneficeProfessionNonCommercial;
		BeneficeActiviteAgricole = beneficeActiviteAgricole;
		RevenuImmobiliers = revenuImmobiliers;
		AutreFraisHonoraires = autreFraisHonoraires;
	}
	
	
}
