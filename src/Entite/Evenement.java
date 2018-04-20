/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class Evenement 
{
    private int id_evenement;
    private String description;
    private LocalDate date_evenement;
    private String photo;
    private  Etablissement etab;
    private String nom_evenement;
    private  int nombre_participant;
    private  int nombre_interesse;
    public Evenement() 
    {
        etab = new Etablissement();
    }
    

    public Evenement(String nom , String description, LocalDate date_evenement, String photo)
    {
        this.nom_evenement=nom;
        this.description=description;
        this.date_evenement=date_evenement;
        this.photo=photo; 
        etab = new Etablissement();
    }

    public int getNombre_participant() {
        return nombre_participant;
    }

    public void setNombre_participant(int nombre_participant) {
        this.nombre_participant = nombre_participant;
    }

    public int getNombre_interesse() {
        return nombre_interesse;
    }

    public void setNombre_interesse(int nombre_interesse) {
        this.nombre_interesse = nombre_interesse;
    }

   

    public int getId_evenement() {
        return id_evenement;
    }

    public void setId_evenement(int id_evenement) {
        this.id_evenement = id_evenement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate_evenement() {
        return date_evenement;
    }

    public void setDate_evenement(LocalDate date_evenement) {
        this.date_evenement = date_evenement;
    }

    public String getPhoto() {
        return photo;
    }

    public String getNom_evenement() {
        return nom_evenement;
    }

    public void setNom_evenement(String nom_evenement) {
        this.nom_evenement = nom_evenement;
    }

    

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Etablissement getEtab() {
        return etab;
    }

    public void setEtab(Etablissement etab) {
        this.etab = etab;
    }

   @Override
   public String toString() {
        return "Evenement{" + "id_evenement=" + id_evenement + ", description=" + description + ", date_evenement=" + date_evenement + ", photo=" + photo + ", etab=" + etab + ", nom=" + nom_evenement + '}';
    }


   
    
    
    
    
    
    
    
    
}
