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
import java.util.Date;

import ma.bean.project.Auteur;
import ma.project.forms.whatweneed;

/**
 *
 * @author Hakim
 */
public class GestionAuteur implements whatweneed<Auteur> {

    PreparedStatement p;
    Connection cn = Connexion.getConnection();
    ResultSet result;
    String requet;

    @Override
    public ArrayList<Auteur> ShowData() {
        ArrayList<Auteur> arr = new ArrayList<Auteur>();

        try {
            requet = "select * from auteur";
            p = cn.prepareStatement(requet);
            result = p.executeQuery();

            while (result.next()) {

                Auteur au = new Auteur(result.getInt("idAuteur"), result.getString("nom"), result.getDate("dateN"), result.getString("photo"));
                arr.add(au);

            }
            p.close();
//           
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return arr;
    }

    @Override
    public void InsertData(Auteur o) {
        try {
            requet = "insert into auteur(nom,dateN,photo) values(?,?,?)";
            p = cn.prepareStatement(requet);
            p.setString(1, o.getNom());
            p.setDate(2, new java.sql.Date(o.getDateN().getTime()));
            p.setString(3, o.getPhoto());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

    @Override
    public void UpdateData(Auteur o) {
        try {
            requet = "update Auteur set nom=?,dateN=? where idAuteur=? ";
            p = cn.prepareStatement(requet);
            p.setString(1, o.getNom());
            p.setDate(2, new java.sql.Date(o.getDateN().getTime()));
            p.setString(4, o.getPhoto());
            p.setInt(5, o.getIdAut());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println("NOOO");
        }
    }

    @Override
    public void DeleteData(Auteur o) {

         try {
            requet = "delete from auteur where idAuteur=?";
            p = cn.prepareStatement(requet);
            p.setInt(1, o.getIdAut());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
