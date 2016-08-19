package fr.dta.application.emprunt.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;

import fr.dta.application.adherent.model.Adherent;
import fr.dta.application.media.model.Media;

@Entity
@Table(name ="emprunt")
public class Emprunt {
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToOne
	@NotBlank
	private Media media;
	
	@ManyToOne
	@NotBlank
	private Adherent adherent;
	
	@Column
	@NotBlank
	@Temporal(TemporalType.DATE)
	private Date dateEmprunt;
	
	@Column
	@Temporal(TemporalType.DATE)
	private Date dateRetourEmprunt;

	public Emprunt(Media media, Adherent adherent, Date dateEmprunt, Date dateRetourEmprunt) {
		super();
		this.media = media;
		this.adherent = adherent;
		this.dateEmprunt = dateEmprunt;
		this.dateRetourEmprunt = dateRetourEmprunt;
	}
	
	public Emprunt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public Adherent getAdherent() {
		return adherent;
	}

	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public Date getDateRetourEmprunt() {
		return dateRetourEmprunt;
	}

	public void setDateRetourEmprunt(Date dateRetourEmprunt) {
		this.dateRetourEmprunt = dateRetourEmprunt;
	}

	public Long getId() {
		return id;
	}
	
	
}
