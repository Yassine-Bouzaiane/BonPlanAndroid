/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;
import Entite.Evenement;
import Entite.Evenement;
import Entite.Utilisateur;
/**
 *
 * @author amine
 */
public class Interesser {
  private Evenement e;
private Utilisateur u ;  

    public Interesser(Evenement e, Utilisateur u) {
        this.e = e;
        this.u = u;
    }

   

    public Evenement getE() {
        return e;
    }

    public void setE(Evenement e) {
        this.e = e;
    }

    public Utilisateur getU() {
        return u;
    }

    public void setU(Utilisateur u) {
        this.u = u;
    }

    public Interesser() {
    }

    @Override
    public String toString() {
        return "Interesser{" + "e=" + e + ", u=" + u + '}';
    }

    
}
