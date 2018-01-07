/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.bean.project;

/**
 *
 * @author Hakim
 */
public class Fonction {
    private int idFonction;
    private String fonction;

    public Fonction() {
    }

    public Fonction(int idFonction) {
        this.idFonction = idFonction;
    }

    public Fonction(String fonction) {
        this.fonction = fonction;
    }

    public Fonction(int idFonc, String fonction) {
        this.idFonction = idFonc;
        this.fonction = fonction;
    }

    public int getIdFonction() {
        return idFonction;
    }

    public void setIdFonction(int idFonction) {
        this.idFonction = idFonction;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    @Override
    public String toString() {
        return fonction;
    }
    
    
}
