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
public class Adherant extends Person{
    private int idAdr;
    private String NumAdherant;

    public Adherant(int idAdr, String NumAdherant) {
        this.idAdr = idAdr;
        this.NumAdherant = NumAdherant;
    }

  

    public Adherant(int idAdr, String NumAdherant, String nom, String cin, String adresse, String tele, String email) {
        super(nom, cin, adresse, tele, email);
        this.idAdr = idAdr;
        this.NumAdherant = NumAdherant;
    }

    public Adherant(String NumAdherant, String nom, String cin, String adresse, String tele, String email) {
        super(nom, cin, adresse, tele, email);
        this.NumAdherant = NumAdherant;
    }
    
    public int getIdAdr() {
        return idAdr;
    }

    public void setIdAdr(int idAdr) {
        this.idAdr = idAdr;
    }

    public String getNumAdherant() {
        return NumAdherant;
    }

    public void setNumAdherant(String NumAdherant) {
        this.NumAdherant = NumAdherant;
    }

    @Override
    public String toString() {
        return super.getNom();
    }
    
    

   

}
