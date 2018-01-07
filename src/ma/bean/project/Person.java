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
public class Person {
    
    private int idpers;
    private String nom,cin,adresse,tele,email;

    public Person() {
    }

    public Person(int idpers, String nom, String cin, String adresse, String tele, String email) {
        this.idpers = idpers;
        this.nom = nom;
        this.cin = cin;
        this.adresse = adresse;
        this.tele = tele;
        this.email = email;
    }

    public Person(String nom, String cin, String adresse, String tele, String email) {
        this.nom = nom;
        this.cin = cin;
        this.adresse = adresse;
        this.tele = tele;
        this.email = email;
    }

    public int getIdpers() {
        return idpers;
    }

    public void setIdpers(int idpers) {
        this.idpers = idpers;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  nom;
    }

    
    
    
    
    
}
