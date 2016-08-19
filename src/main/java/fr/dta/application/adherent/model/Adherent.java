package fr.dta.application.adherent.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Adherent {
	@Id
	@GeneratedValue
	private Long id;
	
	
}
