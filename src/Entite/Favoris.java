/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author admin
 */
public class Favoris {
    private int id_favoris;
    private Etablissement etablissement;
    private Utilisateur utilisateur;

    public Favoris() {
    }

    public Favoris(Etablissement etablissement, Utilisateur utilisateur) {
        this.etablissement = etablissement;
        this.utilisateur = utilisateur;
    }

    public int getId_favoris() {
        return id_favoris;
    }

    public void setId_favoris(int id_favoris) {
        this.id_favoris = id_favoris;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public String toString() {
        return "Favoris{" + "id_favoris=" + id_favoris + ", etablissement=" + etablissement + ", utilisateur=" + utilisateur + '}';
    }

   

   

   

  
    
    
}
