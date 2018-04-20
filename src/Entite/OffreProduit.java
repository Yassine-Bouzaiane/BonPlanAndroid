/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entite;

/**
 *
 * @author Yassine
 */
public class OffreProduit {
      private int id_op;
     private int id_offre;
     private int id_produit;

    public OffreProduit() {
    }

    public OffreProduit(int id_offre, int id_produit) {
        this.id_offre = id_offre;
        this.id_produit = id_produit;
    }

    public OffreProduit(int id_op, int id_offre, int id_produit) {
        this.id_op = id_op;
        this.id_offre = id_offre;
        this.id_produit = id_produit;
    }

     
     
     
     
    public int getId_op() {
        return id_op;
    }

    public void setId_op(int id_op) {
        this.id_op = id_op;
    }

    public int getId_offre() {
        return id_offre;
    }

    public void setId_offre(int id_offre) {
        this.id_offre = id_offre;
    }

    public int getId_produit() {
        return id_produit;
    }

    public void setId_produit(int id_produit) {
        this.id_produit = id_produit;
    }

    @Override
    public String toString() {
        return "OffreProduit{" + "id_op=" + id_op + ", id_offre=" + id_offre + ", id_produit=" + id_produit + '}';
    }
     
     
   
}
