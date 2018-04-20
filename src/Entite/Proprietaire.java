/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

import java.sql.Date;

/**
 *
 * @author malek
 */
public class Proprietaire extends Utilisateur{
    
     private int num_tel;
    private String sexe;
    private Date date_de_naissance ;
   
    private String region;
    private String ville ;
    private String email; 
     private Date date_inscription;
     private String photo_user;
     
     public Proprietaire(){
         
     }
    
     public Proprietaire( String nom, String prenom, Date date_de_naissance, String sexe, int num_tel,  String mot_de_passe, String username ,String region, String roles, String ville, String email , Date date_inscription , String photo_user)
     {
        
        super( nom , prenom , mot_de_passe,username,roles);
        
       
        this.num_tel=num_tel;
        this.sexe=sexe;
        this.region=region;
        this.date_de_naissance=date_de_naissance ;
        this.email=email;
        this.ville=ville;
         this.date_inscription=date_inscription;
         this.photo_user=photo_user;
      }

    public String getPhoto_user() {
        return photo_user;
    }

    public void setPhoto_user(String photo_user) {
        this.photo_user = photo_user;
    }
     
     
     

     public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNum_tel() {
        return num_tel;
    }

    public void setNum_tel(int num_tel) {
        this.num_tel = num_tel;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Date getDate_inscription() {
        return date_inscription;
    }

    public void setDate_inscription(Date date_inscription) {
        this.date_inscription = date_inscription;
    }
    
     
    
    
}
