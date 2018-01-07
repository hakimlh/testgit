/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.project.service;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hakim
 */
public class Connexion {
     public static Connection getConnection(){
        Connection connexion = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_livre?zeroDateTimeBehavior=convertToNull", "root", "");
//            System.err.println("OK");
        } catch (Exception e) {
            
            e.getMessage();
//                        System.err.println("NO conx");

        }
        return connexion;
        
    }
    
}
