/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.sql.Date;

/**
 *
 * @author admin
 */
public class Offre 
{
    private int id_offre;
    private String titre_offre;
    private String description;
    private Date date_debut;
    private Date date_fin;
    private String photo;
    private int nombre_like;
    private int nombre_dislike;
    private Etablissement etablissement;
            
            

    public Offre() 
    {
    }

    public Offre(String titre_offre, String description, Date date_debut, Date date_fin, String photo, int nombre_like, int nombre_dislike, Etablissement etablissement) {
        this.titre_offre = titre_offre;
        this.description = description;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.photo = photo;
        this.nombre_like = nombre_like;
        this.nombre_dislike = nombre_dislike;
        this.etablissement = etablissement;
    }

    public Offre(int id_offre, String titre_offre, String description, Date date_debut, Date date_fin, String photo, int nombre_like, int nombre_dislike, Etablissement etablissement) {
        this.id_offre = id_offre;
        this.titre_offre = titre_offre;
        this.description = description;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.photo = photo;
        this.nombre_like = nombre_like;
        this.nombre_dislike = nombre_dislike;
        this.etablissement = etablissement;
    }

   

    
   
    
    
    public int getId_offre() {
        return id_offre;
    }

    public String getDescription() {
        return description;
    }

    public String getTitre_offre() {
        return titre_offre;
    }

    public void setTitre_offre(String titre_offre) {
        this.titre_offre = titre_offre;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public String getPhoto() {
        return photo;
    }

    public int getNombre_like() {
        return nombre_like;
    }

    public int getNombre_dislike() {
        return nombre_dislike;
    }

    
    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setNombre_like(int nombre_like) {
        this.nombre_like = nombre_like;
    }

    public void setNombre_dislike(int nombre_dislike) {
        this.nombre_dislike = nombre_dislike;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    @Override
    public String toString() {
        return "Offre{" + "id_offre=" + id_offre + ", titre_offre=" + titre_offre + ", description=" + description + ", date_debut=" + date_debut + ", date_fin=" + date_fin + ", photo=" + photo + ", nombre_like=" + nombre_like + ", nombre_dislike=" + nombre_dislike + ", etablissement=" + etablissement + '}';
    }

  
    

    
    
   
    
    
    
}
