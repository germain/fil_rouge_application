package fr.dta.application.cotisation.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;

import fr.dta.application.adherent.model.Adherent;

@Entity
public class Cotisation {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@NotBlank
	@Temporal(TemporalType.DATE)
	private Date dateDerniereCotisation;
	
	@Column
	@NotBlank
	private double montant;
	
	@OneToOne
	private Adherent adherentCotisant;

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

	public Adherent getAdherentCotisant() {
		return adherentCotisant;
	}

	public void setAdherentCotisant(Adherent adherentCotisant) {
		this.adherentCotisant = adherentCotisant;
	}
	
	
	
}
