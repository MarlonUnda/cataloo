/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.jachobryan.catalogoonline;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author labctr
 */
public class CatalogoOnline {

    public static void main(String[] args) {
       Connection conexionDb = ConexionDb.getConnetion();
        if (conexionDb !=null) {
            try{
                conexionDb.close();
            }catch (SQLException e){
                System.err.println(" Error SQL: " +  e.getMessage());
            }
        } //ejecutar operaciones en la base de datos
    }
}
