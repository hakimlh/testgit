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
public class Fonctionnaire extends Person{
    
    private int idFonctionnaire;
    private Fonction fonction;

    public Fonctionnaire() {
    }

    public Fonctionnaire(int idFonctionnaire) {
        this.idFonctionnaire = idFonctionnaire;
    }

    public Fonctionnaire(int idfonc, Fonction fonction) {
        this.idFonctionnaire = idfonc;
        this.fonction = fonction;
    }

    public Fonctionnaire(int idfonc, String nom, String cin, String adresse, String tele, String email, Fonction fonction) {
        super(nom, cin, adresse, tele, email);
        this.idFonctionnaire = idfonc;
        this.fonction = fonction;
    }

    public Fonctionnaire(String nom, String cin, String tele, String adresse, String email,Fonction fonction) {
        super(nom, cin, adresse, tele, email);
        this.fonction = fonction;
    }

    public int getIdFonctionnaire() {
        return idFonctionnaire;
    }

    public void setIdFonctionnaire(int idFonctionnaire) {
        this.idFonctionnaire = idFonctionnaire;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    
    
    
    
    
}
