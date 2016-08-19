package fr.dta.application.media.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import fr.dta.application.adherent.model.Adherent;
import fr.dta.application.emprunt.model.Emprunt;

@Entity
@Table(name ="media")
public class Media {
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	@NotBlank
	private String title;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	private Type type;
	
	@Column
	@NotBlank
	private String author;
	
	@OneToMany(mappedBy="media")
	private List<Emprunt> emprunt;
	
	public Media(String title, Type type, String author, List<Emprunt> emprunt) {
		super();
		this.title = title;
		this.type = type;
		this.author = author;
		this.emprunt = emprunt;
	}
	
	public Media(String title, Type type, String author) {
		super();
		this.title = title;
		this.type = type;
		this.author = author;
	}

	public Media() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public List<Emprunt> getEmprunt() {
		
		if (emprunt == null) {
			emprunt = new ArrayList<Emprunt>();
		}
		return emprunt;
	}

	public void setEmprunt(List<Emprunt> emprunt) {
		this.emprunt = emprunt;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Media [title=" + title + ", type=" + type + ", author=" + author + "]";
	}
	
}
