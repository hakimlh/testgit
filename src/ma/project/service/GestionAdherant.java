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
import ma.project.forms.whatweneed;

/**
 *
 * @author Hakim
 */
public class GestionAdherant implements whatweneed<Adherant> {

    PreparedStatement p;
    Connection cn = Connexion.getConnection();
    ResultSet result;
    String requet;

    @Override
    public ArrayList<Adherant> ShowData() {
        ArrayList<Adherant> arr = new ArrayList<>();

        try {
            requet = "select * from adherant";
            p = cn.prepareStatement(requet);
            result = p.executeQuery();

            while (result.next()) {
//                System.err.println(result.getInt("idAdherant")+" "+result.getString("numAdherant")+" "+result.getString("nom")+" "+
//                         result.getString("cin")+" "+ result.getString("tele")+" "+
//                        result.getString("adresse")+" "+ result.getString("email"));
                        
                Adherant ad = new Adherant(result.getInt("idAdherant"),result.getString("numAdherant"), result.getString("nom"),
                         result.getString("cin"), result.getString("tele"),
                        result.getString("adresse"), result.getString("email"));
                arr.add(ad);

            }
            p.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return arr;
    }

    @Override
    public void InsertData(Adherant o) {
        try {

            requet = "insert into adherant(numAdherant,nom,cin,tele,adresse,email) values(?,?,?,?,?,?)";
            p = cn.prepareStatement(requet);
            p.setString(1, o.getNumAdherant());
            p.setString(2, o.getNom());
            p.setString(3, o.getCin());
            p.setString(4, o.getTele());
            p.setString(5, o.getAdresse());
            p.setString(6, o.getEmail());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

    @Override
    public void UpdateData(Adherant o) {
        try {

            requet = "update adherant set numAdherant=?,nom=?,cin=?,tele=?,adresse=?,email=? where idAdherant=?";
            p = cn.prepareStatement(requet);
            p.setString(1, o.getNumAdherant());
            p.setString(2, o.getNom());
            p.setString(3, o.getCin());
            p.setString(4, o.getTele());
            p.setString(5, o.getAdresse());
            p.setString(6, o.getEmail());            
            p.setInt(7, o.getIdAdr());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

    @Override
    public void DeleteData(Adherant o) {
         try {

            requet = "delete from adherant where idAdherant=?";
            p = cn.prepareStatement(requet);
            p.setInt(1, o.getIdAdr());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

}
