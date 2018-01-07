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
import ma.bean.project.Livre;
import ma.project.forms.whatweneed;

/**
 *
 * @author Hakim
 */
public class GestionLivre implements whatweneed<Livre> {

    PreparedStatement p;
    Connection cn = Connexion.getConnection();
    ResultSet result;
    String requet;

    @Override
    public ArrayList<Livre> ShowData() {
        ArrayList<Livre> arr = new ArrayList<>();
        Livre au;
        try {
            requet = "select * from livre";
            p = cn.prepareStatement(requet);
            result = p.executeQuery();

            while (result.next()) {
                au = new Livre(result.getInt("idLivre"), result.getString("titre"),
                        result.getDate("DateLivre"), result.getInt("code"), result.getInt("idAuteur"), result.getInt("nbrEmp"), result.getString("image"));
                arr.add(au);
            }
            p.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return arr;
    }

    public ArrayList<Livre> ShowtDataSearch(String o) {
        ArrayList<Livre> arr = new ArrayList<>();
        Livre au;

        try {
            try {
                Integer.parseInt(o);
                requet = "select * from livre where  code=?";
                p = cn.prepareStatement(requet);
                p.setInt(1, Integer.valueOf(o));

            } catch (NumberFormatException e) {

                requet = "select * from livre where titre=?";
                p = cn.prepareStatement(requet);
                p.setString(1, o);

            }
            result = p.executeQuery();
            while (result.next()) {
                au = new Livre(result.getInt("idLivre"), result.getString("titre"),
                        result.getDate("DateLivre"), result.getInt("code"), result.getInt("idAuteur"), result.getInt("nbrEmp"), result.getString("image"));
                arr.add(au);
            }
            p.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
            System.err.println("Catch");

        }
        return arr;
    }

    @Override
    public void InsertData(Livre o) {

        try {
            requet = "insert into livre(titre,dateLivre,code,idAuteur,nbrEmp,image) values(?,?,?,?,?,?)";
            p = cn.prepareStatement(requet);
            p.setString(1, o.getTitre());
            p.setDate(2, new java.sql.Date(o.getDateLivre().getTime()));
            p.setInt(3, o.getCode());
            p.setInt(4, o.getIdAuteur());
            p.setInt(4, o.getNbrEmp());
            p.setString(5, o.getImage());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

    @Override
    public void UpdateData(Livre o) {

        try {
            requet = "update Livre set titre=?,dateLivre=?,code=?,idAuteur=?,nbrEmp=? image=? where idLive=?";
            p = cn.prepareStatement(requet);
            p.setString(1, o.getTitre());
            p.setDate(2, new java.sql.Date(o.getDateLivre().getTime()));
            p.setInt(3, o.getCode());
            p.setInt(4, o.getIdAuteur());
            p.setInt(5, o.getNbrEmp());
            p.setString(6, o.getImage());
            p.setInt(7, o.getIdLivre());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println("NOOO");
        }
    }

    public void UpdateNombreEmp(Livre o) {
        try {
            requet = "update livre set nbrEmp=? where idLivre=?";
            p = cn.prepareStatement(requet);
            p.setInt(1, o.getNbrEmp());
            p.setInt(2, o.getIdLivre());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println("NOOO UpdateNombreEmp");
        }

    }

    @Override
    public void DeleteData(Livre o) {
        try {
            requet = "delete from livre where idLivre=?";
            p = cn.prepareStatement(requet);
            p.setInt(1, o.getIdLivre());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
