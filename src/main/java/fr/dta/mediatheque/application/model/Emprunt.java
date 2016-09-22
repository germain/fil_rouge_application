package fr.dta.mediatheque.application.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import fr.dta.mediatheque.application.core.Model;

@Entity
@Table(name ="emprunt")
public class Emprunt implements Model {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@NotNull
	private Media media;
	
	@ManyToOne
	@NotNull
	private fr.dta.mediatheque.application.model.Adherent adherent;
	
	@Column
	@NotNull
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
	
	public Emprunt(Media media, Adherent adherent, Date dateEmprunt) {
		super();
		this.media = media;
		this.adherent = adherent;
		this.dateEmprunt = dateEmprunt;
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

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
		
	}
	
	
}
