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
public class Evaluation {
    private Experience experience;
    private double note;
    private CriteresEvaluation critere_evaluation;
    
    public Evaluation() {
    }

    public Evaluation(Experience experience, int note, CriteresEvaluation critere_evaluation) {
        this.experience = experience;
        this.note = note;
        this.critere_evaluation = critere_evaluation;
    }

    public Experience getExperience() {
        return experience;
    }

    public double getNote() {
        return note;
    }

    public CriteresEvaluation getCritere_evaluation() {
        return critere_evaluation;
    }

    public void setExperience(Experience experience) {
        this.experience = experience;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public void setCritere_evaluation(CriteresEvaluation critere_evaluation) {
        this.critere_evaluation = critere_evaluation;
    }

    @Override
    public String toString() {
        return "Evaluation{" + "experience=" + experience + ", note=" + note + ", critere_evaluation=" + critere_evaluation + '}';
    }

   


   
}
