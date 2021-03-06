package fr.dta.mediatheque.application.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import fr.dta.mediatheque.application.core.Model;

 
@Entity
@Table(name="cotisation")
public class Cotisation implements Model {
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dateDerniereCotisation;
	
	@Column
	@NotNull
	private double montant;
	
	public Cotisation(){
		
	}
	
	public Cotisation(Date dateDerniereCotisation, double montant) {
		this.dateDerniereCotisation = dateDerniereCotisation;
		this.montant = montant;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	public Date getDateDerniereCotisation() {
		return dateDerniereCotisation;
	}

	public void setDateDerniereCotisation(Date dateDerniereCotisation) {
		this.dateDerniereCotisation = dateDerniereCotisation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}	
	
}
