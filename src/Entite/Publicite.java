/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class Publicite 
{
    private int id_publicite;
    private String description_publicite;
    private String photo_publicite;
    private int enabled;
    private String titre;
    private LocalDate dateDebut;
    
    private Etablissement etablissement;
    private int nbre_click;
    public Publicite() 
    {
        etablissement=new Etablissement();
    }

    public Publicite(String description_publicite, String photo_publicite, int enabled, String titre, LocalDate dateDebut, Etablissement etablissement, int nbre_click) {
        this.description_publicite = description_publicite;
        this.photo_publicite = photo_publicite;
        this.enabled = enabled;
        this.titre = titre;
        this.dateDebut = dateDebut;
        this.etablissement = etablissement;
        this.nbre_click = nbre_click;
    }

   

   

    

    
    
    public int getId_publicite() {
        return id_publicite;
    }

    public void setId_publicite(int id_publicite) {
        this.id_publicite = id_publicite;
    }

    public String getDescription_publicite() {
        return description_publicite;
    }

    public String getPhoto_publicite() {
        return photo_publicite;
    }

    public Etablissement getEtablissement() {
        return etablissement;
    }

    public void setDescription_publicite(String description_publicite) {
        this.description_publicite = description_publicite;
    }

    public void setPhoto_publicite(String photo_publicite) {
        this.photo_publicite = photo_publicite;
    }

    public void setEtablissement(Etablissement etablissement) {
        this.etablissement = etablissement;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getNbre_click() {
        return nbre_click;
    }

    public void setNbre_click(int nbre_click) {
        this.nbre_click = nbre_click;
    }
    
    
        

    @Override
    public String toString() {
        return titre ;
    
    
}
//
//    @Override
//    public String toString() {
//        return "Publicite{" + "id_publicite=" + id_publicite + ", description_publicite=" + description_publicite + ", photo_publicite=" + photo_publicite + ", enabled=" + enabled + ", titre=" + titre + ", dateDebut=" + dateDebut + ", etablissement=" + etablissement + ", nbre_click=" + nbre_click + '}';
//    }
}