package com.dev.OnImpots.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity 
//@Inheritance(strategy=InheritanceType.table_per_class)
public class Exercice /*extends DeclarationImpots */implements Serializable{

	@Id int CodeEx;
	Date DateOuverture;
	Date DateCloture;
	String CadreLegal;

	
	
}
