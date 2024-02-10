/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jachobryan.catalogoonline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author labctr
 */
public class ConexionDb {
    public static Connection getConnetion(){
        Connection conexion = null;
        
        try{
            String urldb= "jdbc:mysql://localhost:3306/catalogoonline";
            String usuariodb = "root";
            String passworddb = "";
            
            //conexion=DriverManager.getConnection(urldb, usuariodb, passworddb);
           conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogoonline", "root", "");
            System.out.println("Conectado a la base de datos");
        }catch(SQLException e){
            System.err.println("Error de conexion a la base de datos" + e.getMessage());
        }
        return conexion;
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
