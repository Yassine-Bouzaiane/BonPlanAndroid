
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.sql.Date;

/**
 *
 * @author amine
 */
public class Experience {
    private int id_exp;
    private String description_experience;
    private String preuve;
    private Utilisateur utilisateur ;
    private Etablissement etablissement;
private Date date_exp;
    
    public Experience() {
    }

    public Experience( String description_experience, String preuve, Utilisateur utilisateur, Etablissement etablissement, Date date_exp) {
        this.description_experience = description_experience;
        this.preuve = preuve;
        this.utilisateur = utilisateur;
        this.etablissement = etablissement;
        this.date_exp = date_exp;
    }

   

    public int getId_exp() {
        return id_exp;
    }

    public String getDescription_experience() {
        return description_experience;
    }

    public String getPreuve() {
        return preuve;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setId_exp(int id_exp) {
        this.id_exp = id_exp;
    }

    public void setDescription_experience(String description_experience) {
        this.description_experience = description_experience;
    }

    public void setPreuve(String preuve) {
        this.preuve = preuve;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public Date getDate_exp() {
        return date_exp;
    }

    public void setDate_exp(Date date_exp) {
        this.date_exp = date_exp;
    }

    @Override
    public String toString() {
        return "Experience{" + "id_exp=" + id_exp + ", description_experience=" + description_experience + ", preuve=" + preuve + ", utilisateur=" + utilisateur + ", etablissement=" + etablissement + ", date_exp=" + date_exp + '}';
    }

    
    

    
}