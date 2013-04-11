import java.util.Date;
import java.util.Iterator;

import dao.Categorie;
import dao.Produit;
import dao.Services;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load services
		Services s = new Services();
		
		// les produits
		Produit p1 = new Produit("PC1", "Description1", (double) 7000);
		Produit p2 = new Produit("PC2", "Description2", (double) 5000);
		Produit p3 = new Produit("PC3", "Description3", (double) 6000);
		Produit p4 = new Produit("PC4", "Description4", (double) 11000);

		s.addProduit(p1);
		s.addProduit(p2);
		s.addProduit(p3);
		s.addProduit(p4);
		
		// les catégories
		
		Categorie c1 = new Categorie("inforamtique1","info1",new Date());
		Categorie c2 = new Categorie("inforamtique2","info3",new Date());
		Categorie c3 = new Categorie("inforamtique3","info5",new Date());
		Categorie c4 = new Categorie("inforamtique4","info6",new Date());

		s.addCategorie(c1);
		s.addCategorie(c2);
		s.addCategorie(c3);
		s.addCategorie(c4);
		
		// get
		
		/*
		Categorie categorie = s.getCategorie(new Long(1));
		categorie.show();
		
		Produit produit = s.getProduit(2L);
		produit.show();
		
		
		// List
		
		
		System.out.println("La liste des produits : ");
		
		Iterator<Produit> produits = s.getAllProduits().iterator();
		
		while(produits.hasNext()){
			Produit p = produits.next();
			p.show();
		}
		
		*/
		
		// Affectation
		System.out.println("Affectation");
		s.addProduitToCategorie(1L, 1L);
		s.addProduitToCategorie(1L, 2L);
		s.addProduitToCategorie(1L, 3L);
		s.addProduitToCategorie(2L, 1L);
		s.addProduitToCategorie(3L, 1L);
		s.addProduitToCategorie(4L, 2L);
		
		/*
		Categorie categorie = s.getCategorie(new Long(1));
		System.out.println("L'info de cat : ");
		categorie.show();
		System.out.println("produits de cat : ");
		Iterator<Produit> iterator = categorie.getProduits().iterator();
		while(iterator.hasNext()){
			Produit p = iterator.next();
			p.show();
		}
		*/
		
		Produit produit = s.getProduit(1L);
		System.out.println("L'info de prod : ");
		produit.show();
		System.out.println("cat de prod : ");
		
		Iterator<Categorie> iterator = produit.getCategories().iterator();
		while(iterator.hasNext()){
				Categorie c = iterator.next();
				c.show();
		}
		
		
		
		
		
	}

}
