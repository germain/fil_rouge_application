<<<<<<< HEAD:src/main/java/application/model/cotisation/Cotisation.java
package application.model.cotisation;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import application.core.Model;

 
@Entity
public class Cotisation implements Model {
	@Id
	@GeneratedValue
	private Long id;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
=======
package application.model.cotisation;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import application.core.Model;

 
@Entity
public class Cotisation implements Model {
	@Id
	@GeneratedValue
	private Long id;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
>>>>>>> 723622ee5438056a6455e4959f990d977615a556:src/main/java/application/model/cotisation/Cotisation.java
