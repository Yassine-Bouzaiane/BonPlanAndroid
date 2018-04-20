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
public class Test {
    
    private int id_commentaire;
    private String commen;
    private String nom;
    private String prenom;
    private String photo_user;
    private Utilisateur utilisateur;
    private Experience experience;

    public Test(int id_commentaire,String commen, String nom, String prenom, String photo_user, Utilisateur utilisateur) {
        this.id_commentaire=id_commentaire;
        this.commen = commen;
        this.nom = nom;
        this.prenom = prenom;
        this.photo_user = photo_user;
        this.utilisateur = utilisateur;
    }

    

    

    public Test(){
        
    }

    public int getId_commentaire() {
        return id_commentaire;
    }

    public void setId_commentaire(int id_commentaire) {
        this.id_commentaire = id_commentaire;
    }

    public String getCommen() {
        return commen;
    }

    public void setCommen(String commen) {
        this.commen = commen;
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

    public String getPhoto_user() {
        return photo_user;
    }

    public void setPhoto_user(String photo_user) {
        this.photo_user = photo_user;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Experience getExperience() {
        return experience;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }
    

    @Override
    public String toString() {
        return "Test{" + "id_commentaire=" + id_commentaire + ", commen=" + commen + ", nom=" + nom + ", prenom=" + prenom + ", photo_user=" + photo_user + ", utilisateur=" + utilisateur + '}';
    }

   

    
   
    
    
    
    
    
    
    
}
