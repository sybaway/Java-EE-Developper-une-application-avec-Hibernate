package dao;

import java.util.HashSet;
import java.util.Set;

public class Produit {
	
	private Long idProduit;
	private String nom;
	private String description;
	private Double prix;
	private Set<Categorie> categories = new HashSet<Categorie>();

	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Produit(String nom, String description, Double prix) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
	}



	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	public Set<Categorie> getCategories() {
		return categories;
	}



	public void setCategories(Set<Categorie> categories) {
		this.categories = categories;
	}



	public void show(){
		System.out.println(this.nom + " - " + this.description + " - " + this.prix.toString());
	}
	
}
