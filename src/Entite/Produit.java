/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entite;

/**
 *
 * @author malek
 */
public class Produit {
    
    private int id_produit;
    private String nom_produit;
    private String photo_produit;
    private double prix_produit;
    private Etablissement etablissement;
    
    public Produit(){
        
    }

    public Produit(int id_produit, String nom_produit, String photo_produit, double prix_produit, Etablissement etablissement) {
        this.id_produit = id_produit;
        this.nom_produit = nom_produit;
        this.photo_produit = photo_produit;
        this.prix_produit = prix_produit;
        this.etablissement = etablissement;
    }

    public Produit(String nom_produit, String photo_produit, double prix_produit, Etablissement etablissement) {
        this.nom_produit = nom_produit;
        this.photo_produit = photo_produit;
        this.prix_produit = prix_produit;
        this.etablissement = etablissement;
    }

  

   

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    public String getNom_produit() {
        return nom_produit;
    }

    public void setNom_produit(String nom_produit) {
        this.nom_produit = nom_produit;
    }

    public String getPhoto_produit() {
        return photo_produit;
    }

    public void setPhoto_produit(String photo_produit) {
        this.photo_produit = photo_produit;
    }

    public double getPrix_produit() {
        return prix_produit;
    }

    public void setPrix_produit(double prix_produit) {
        this.prix_produit = prix_produit;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    @Override
    public String toString() {
        return "Produit{" + "id_produit=" + id_produit + ", nom_produit=" + nom_produit + ", photo_produit=" + photo_produit + ", prix_produit=" + prix_produit + ", etablissement=" + etablissement + '}';
    }

   

    
    
}
