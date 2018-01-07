/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ma.bean.project.Adherant;
import ma.bean.project.Fonction;
import ma.bean.project.Fonctionnaire;
import ma.project.forms.whatweneed;

/**
 *
 * @author Hakim
 */
public class GestionFonctionnaire implements whatweneed<Fonctionnaire> {

    PreparedStatement p;
    Connection cn = Connexion.getConnection();
    ResultSet result;
    String requet;
    
    GestionFonction gst= new GestionFonction();
    
    @Override
    public ArrayList<Fonctionnaire> ShowData() {
        ArrayList<Fonctionnaire> arr = new ArrayList<>();        
        ArrayList<Fonction> fct = gst.ShowData();
        Fonctionnaire ad = new Fonctionnaire();


        try {
            requet = "select * from fonctionnaire";
            p = cn.prepareStatement(requet);
            result = p.executeQuery();

            while (result.next()) {
                for (Fonction f : fct) {
                    if (f.getIdFonction()== result.getInt("fonction")) {
                        ad = new Fonctionnaire(result.getInt("idFonctionnaire"),result.getString("nom"),
                         result.getString("cin"), result.getString("tele"),
                        result.getString("adresse"), result.getString("email"),f);
                        break;
                    }
                }
                
                arr.add(ad);

            }
            p.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return arr;
    }

    @Override
    public void InsertData(Fonctionnaire o) {
        try {

            requet = "insert into fonctionnaire(nom,cin,tele,adresse,email,fonction) values(?,?,?,?,?,?)";
            p = cn.prepareStatement(requet);
            p.setString(1, o.getNom());
            p.setString(2, o.getCin());
            p.setString(3, o.getTele());
            p.setString(4, o.getAdresse());
            p.setString(5, o.getEmail());            
            p.setInt(6, o.getFonction().getIdFonction());

            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

    @Override
    public void UpdateData(Fonctionnaire o) {
        try {

            requet = "update adherant set nom=?,cin=?,tele=?,adresse=?,email=?,fonction=? where idFonctionnaire=?";
            p = cn.prepareStatement(requet);
            p.setString(1, o.getNom());
            p.setString(2, o.getCin());
            p.setString(3, o.getTele());
            p.setString(4, o.getAdresse());
            p.setString(5, o.getEmail());            
            p.setInt(6, o.getFonction().getIdFonction());            
            p.setInt(7, o.getIdFonctionnaire());

            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

    @Override
    public void DeleteData(Fonctionnaire o) {
         try {

            requet = "delete from fonctionnaire where idFonctionnaire=?";
            p = cn.prepareStatement(requet);
            p.setInt(1, o.getIdFonctionnaire());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

}
