/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectores;

import java.sql.SQLException;

/**
 *
 * @author cosma_000
 */
public class ConectorMysql extends Conexion {
    private static ConectorMysql instancia;
    public ConectorMysql(){
    
           servidor = "localhost";

            database = "apis";
          password="";
          usuario="root";
          port = "3306";
          driver= "mysql";
    }
    
 
    
    public static ConectorMysql getConectorMysql(){
    if(instancia == null){
    return instancia = new ConectorMysql();
    
    
    }else return instancia;
    
    }

    
    
    
    @Override
  
    public boolean cerrarConexion(){
      boolean f;
        try {

            conexion.close();
             f=true;
             instancia = null;
             System.out.println("Cerrando conexion a "+url+" . . . . . Ok");

        } catch (SQLException ex) {

            System.out.println(ex);
                f=false;
        }

        conexion=null;

        return f;

    }

 
}
