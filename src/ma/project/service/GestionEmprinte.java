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
import ma.bean.project.Adherant;
import ma.bean.project.Emprinte;
import ma.project.forms.whatweneed;

/**
 *
 * @author Hakim
 */
public class GestionEmprinte implements whatweneed<Emprinte> {

    PreparedStatement p;
    Connection cn = Connexion.getConnection();
    ResultSet result;
    String requet;

    @Override
    public ArrayList<Emprinte> ShowData() {

        ArrayList<Emprinte> arr = new ArrayList<Emprinte>();
        try {
            requet = "select * from emprinte";
            p = cn.prepareStatement(requet);
            result = p.executeQuery();

            while (result.next()) {

                Emprinte em = new Emprinte(result.getInt("idEmp"),result.getInt("idlivreEmp"), result.getDate("dateEmp"),
                        result.getDate("dateExp"), result.getInt("idAdherant"));
                arr.add(em);
            }
            p.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return arr;
    }
    public ArrayList<Emprinte> ShowDataBetweenDates(Date x, Date y) {

        ArrayList<Emprinte> arr = new ArrayList<Emprinte>();
        try {
            requet = "select * from emprinte where dateEmp between ? and ?" ;
            p = cn.prepareStatement(requet);
            p.setDate(1, new java.sql.Date(x.getTime()));
            p.setDate(2, new java.sql.Date(y.getTime()));
            result = p.executeQuery();

            while (result.next()) {

                Emprinte em = new Emprinte(result.getInt("idEmp"),result.getInt("idlivreEmp"), result.getDate("dateEmp"),
                        result.getDate("dateExp"), result.getInt("idAdherant"));
                arr.add(em);
            }
            p.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return arr;
    }

    @Override
    public void InsertData(Emprinte o) {
        try {

            requet = "insert into emprinte(idlivreEmp,dateEmp,dateExp,idAdherant) values(?,?,?,?)";
            p = cn.prepareStatement(requet);
            p.setInt(1, o.getIdlivreEmp());
            p.setDate(2, new java.sql.Date(o.getDateEmp().getTime()));
            p.setDate(3, new java.sql.Date(o.getDateExp().getTime()));
            p.setInt(4, o.getIdAdherant());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

    @Override
    public void UpdateData(Emprinte o) {

        try {

            requet = "update emprinte set idlivreEmp=?,	dateEmp=?,dateExp=?,idAdherant=? where idEmp=?";
            p = cn.prepareStatement(requet);
            p.setInt(1, o.getIdlivreEmp());
            p.setDate(2, new java.sql.Date(o.getDateEmp().getTime()));
            p.setDate(3, new java.sql.Date(o.getDateExp().getTime()));
            p.setInt(4, o.getIdAdherant());
            p.setInt(5, o.getIdEmp());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

    @Override
    public void DeleteData(Emprinte o) {
        try {

            requet = "delete from emprinte where idEmp=?";
            p = cn.prepareStatement(requet);
            p.setInt(1, o.getIdEmp());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

}
