/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author amine
 */
public class CriteresEvaluation {
    
  private int id_critere;
  private String nom_critere_evaluation ;
  private  Categorie categorie;

   

    public CriteresEvaluation() {
    }

    public CriteresEvaluation( String nom_critere_evaluation, Categorie categorie) {
        
        this.nom_critere_evaluation = nom_critere_evaluation;
        this.categorie = categorie;
    }

    
    public int getId_critere() {
        return id_critere;
    }

    public void setId_critere(int id_critere) {
        this.id_critere = id_critere;
    }

    public String getNom_critere_evaluation() {
        return nom_critere_evaluation;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setNom_critere_evaluation(String nom_critere_evaluation) {
        this.nom_critere_evaluation = nom_critere_evaluation;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "CriteresEvaluation{" + "id_critere=" + id_critere + ", nom_critere_evaluation=" + nom_critere_evaluation + ", categorie=" + categorie + '}';
    }

    

   

}
