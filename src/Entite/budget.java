/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author Nadia
 */
public enum budget {

     Faible("Faible",0),Moyen("Moyen",1),Cher("Cher",2);
    private String name;
    private int valeur;

    private budget(String name,int valeur) {
        this.name=name;
        this.valeur = valeur;
        
    }

    public String getName() {
        return name;
    }

    public int getValeur() {
        return valeur;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    
}
