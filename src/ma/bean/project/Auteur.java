/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.bean.project;

import java.util.Date;

/**
 *
 * @author Hakim
 */
public class Auteur {
    private int IdAut;
    private String Nom;
    private Date DateN;
    private String photo;

    public Auteur() {
    }

    public Auteur(int IdAut, String Nom, Date DateN, String photo) {
        this.IdAut = IdAut;
        this.Nom = Nom;
        this.DateN = DateN;
        this.photo = photo;
    }

    public Auteur(String Nom, Date DateN, String photo) {
        this.Nom = Nom;
        this.DateN = DateN;
        this.photo = photo;
    }

    public int getIdAut() {
        return IdAut;
    }

    public void setIdAut(int IdAut) {
        this.IdAut = IdAut;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public Date getDateN() {
        return DateN;
    }

    public void setDateN(Date DateN) {
        this.DateN = DateN;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

   

    @Override
    public String toString() {
        return Nom ;
    }
    
    
}
