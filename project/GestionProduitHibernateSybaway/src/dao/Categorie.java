package dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Categorie {
	
	private Long idCategorie;
	private String titre;
	private String description;
	private Date dateAjout;
	private Set<Produit> produits = new HashSet<Produit>();
	
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(String titre, String description, Date dateAjout) {
		super();
		this.titre = titre;
		this.description = description;
		this.dateAjout = dateAjout;
	}

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateAjout() {
		return dateAjout;
	}

	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	
	public void show(){
		System.out.println(this.titre + " - " + this.description + " - " + this.dateAjout.toString());
	}
	
	
	
}
