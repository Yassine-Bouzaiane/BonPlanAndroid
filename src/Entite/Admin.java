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
public class Admin extends Utilisateur{
    
    private String email;
    public Admin(){
        
    }
    
    public Admin( String nom, String prenom,String username, String mot_de_passe, String roles,String email){
        super( nom , prenom , mot_de_passe,username,roles);
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String toString() {
        return "id=" + id_user + ", nom=" + nom + ", prenom=" + prenom + ", mot_de_passe=" + mot_de_passe + ", login=" + username + "roles="+roles +"email="+email   ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
