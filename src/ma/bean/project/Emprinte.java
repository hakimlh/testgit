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
public class Emprinte {
    
    private int idEmp;
    private int idlivreEmp;
    private Date dateEmp;
    private Date dateExp;
    private int idAdherant;
    

    public Emprinte() {
    }

    public Emprinte(int idEmp) {
        this.idEmp = idEmp;
    }

    public Emprinte(int idEmp, int idlivreEmp, Date dateEmp, Date dateExp, int idAdherant) {
        this.idEmp = idEmp;
        this.idlivreEmp = idlivreEmp;
        this.dateEmp = dateEmp;
        this.dateExp = dateExp;
        this.idAdherant = idAdherant;
        
    }

    public Emprinte(int idlivreEmp, Date dateEmp, Date dateExp, int idAdherant) {
        this.idlivreEmp = idlivreEmp;
        this.dateEmp = dateEmp;
        this.dateExp = dateExp;
        this.idAdherant = idAdherant;
        
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public int getIdlivreEmp() {
        return idlivreEmp;
    }

    public void setIdlivreEmp(int idlivreEmp) {
        this.idlivreEmp = idlivreEmp;
    }

    public Date getDateEmp() {
        return dateEmp;
    }

    public void setDateEmp(Date dateEmp) {
        this.dateEmp = dateEmp;
    }

    public Date getDateExp() {
        return dateExp;
    }

    public void setDateExp(Date dateExp) {
        this.dateExp = dateExp;
    }

    public int getIdAdherant() {
        return idAdherant;
    }

    public void setIdAdherant(int idAdherant) {
        this.idAdherant = idAdherant;
    }


    
    
    
    
    
}
