package application.model.adherent;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import application.core.Model;
import application.model.cotisation.Cotisation;

@Entity
public class Adherent implements Model {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@NotBlank
	private String nom;
	
	@Column
	@NotBlank
	private String prenom;
	
	@Column
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	
	@Column(unique=true)
	@NotBlank
	private String email;
	
	@Column
	private String adresse;
	
	@Column
	private int postal;
	
	@Column
	private String ville;
	
	@Column
	private int nbEmpruntEnCours;
	
	@OneToOne
	private Cotisation cotisation;
	
	public Adherent(){
		
	}

	public Adherent(String nom, String prenom, Date dateNaissance, String email, String adresse, int postal,
			String ville, int nbEmpruntEnCours, Cotisation cotisation) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.adresse = adresse;
		this.postal = postal;
		this.ville = ville;
		this.nbEmpruntEnCours = nbEmpruntEnCours;
		this.cotisation = cotisation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getPostal() {
		return postal;
	}

	public void setPostal(int postal) {
		this.postal = postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getNbEmpruntEnCours() {
		return nbEmpruntEnCours;
	}

	public void setNbEmpruntEnCours(int nbEmpruntEnCours) {
		this.nbEmpruntEnCours = nbEmpruntEnCours;
	}

	public Cotisation getCotisation() {
		return cotisation;
	}

	public void setCotisation(Cotisation cotisation) {
		this.cotisation = cotisation;
	}
		
}
