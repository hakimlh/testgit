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
public class Livre {
    
    private int idLivre;
    private String titre;
    private Date dateLivre;
    private int code;
    private int IdAuteur;
    private int nbrEmp;
    private String image;

    public Livre() {
    }

    public Livre(int idLivre, int nbrEmp) {
        this.idLivre = idLivre;
        this.nbrEmp = nbrEmp;
    }

    public Livre(int idLivre, String titre, Date dateLivre, int code, int IdAuteur, int nbrEmp, String image) {
        this.idLivre = idLivre;
        this.titre = titre;
        this.dateLivre = dateLivre;
        this.code = code;
        this.IdAuteur = IdAuteur;
        this.nbrEmp = nbrEmp;
        this.image = image;
    }

    public Livre(String titre, Date dateLivre, int code, int IdAuteur, int nbrEmp, String image) {
        this.titre = titre;
        this.dateLivre = dateLivre;
        this.code = code;
        this.IdAuteur = IdAuteur;
        this.nbrEmp = nbrEmp;
        this.image = image;
    }

    public int getIdLivre() {
        return idLivre;
    }

    public void setIdLivre(int idLivre) {
        this.idLivre = idLivre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDateLivre() {
        return dateLivre;
    }

    public void setDateLivre(Date dateLivre) {
        this.dateLivre = dateLivre;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getIdAuteur() {
        return IdAuteur;
    }

    public void setIdAuteur(int IdAuteur) {
        this.IdAuteur = IdAuteur;
    }

    public int getNbrEmp() {
        return nbrEmp;
    }

    public void setNbrEmp(int nbrEmp) {
        this.nbrEmp = nbrEmp;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return titre ;
    }
    
    
    
}
