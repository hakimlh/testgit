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
import ma.bean.project.Fonction;
import ma.bean.project.Fonctionnaire;
import ma.project.forms.whatweneed;

/**
 *
 * @author Hakim
 */
public class GestionFonction implements whatweneed<Fonction> {

    PreparedStatement p;
    Connection cn = Connexion.getConnection();
    ResultSet result;
    String requet;

    @Override
    public ArrayList<Fonction> ShowData() {
        ArrayList<Fonction> arr = new ArrayList<>();
        Fonction ad = new Fonction();

        try {
            requet = "select * from fonction";
            p = cn.prepareStatement(requet);
            result = p.executeQuery();

            while (result.next()) {

                ad = new Fonction(result.getInt("idFonction"), result.getString("fonction"));
                arr.add(ad);
            }
            p.close();
        } catch (SQLException ex) {
            System.out.print(ex.getMessage());
        }
        return arr;
    }

    @Override
    public void InsertData(Fonction o) {

        try {

            requet = "insert into fonction(fonction) values(?)";
            p = cn.prepareStatement(requet);
            p.setString(1, o.getFonction());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

    @Override
    public void UpdateData(Fonction o) {
        try {

            requet = "update fonction set fonction=? where idFonction=?";
            p = cn.prepareStatement(requet);
            p.setString(1, o.getFonction());
            p.setInt(2, o.getIdFonction());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }
    }

    @Override
    public void DeleteData(Fonction o) {
        try {

            requet = "delete from fonction where idFonction=?";
            p = cn.prepareStatement(requet);
            p.setInt(1, o.getIdFonction());
            p.executeUpdate();
            p.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("error");

        }

    }
}
