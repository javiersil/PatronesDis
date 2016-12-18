/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conectores;

/**
 *
 * @author cosma_000
 */

import java.sql.*;

 

public abstract class Conexion {

 

    protected Connection conexion=null;

    protected String servidor="";

    protected String database="";

    protected String usuario="";

    protected String password="";

   protected String url="";
    
   protected String port;
   protected String driver;


    public void setConexion(){

        try {

 


            Class.forName("com."+driver+".jdbc.Driver");

            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

            url="jdbc:"+driver+"://"+servidor+":"+port+"/"+database;

            conexion=DriverManager.getConnection(url, usuario, password);
            
            

            System.out.println("Conexion a Base de Datos "+url+" . . . . .Ok");
              
           

        }
        

        catch (SQLException ex) {

            System.out.println(ex);

        }

        catch (ClassNotFoundException ex) {

            System.out.println(ex);

        }

    }
    
 public String getDriver() {
            
return driver;
}
public boolean updateSQL(String sql)
{
   try {
      Statement sentencia = conexion.createStatement();
      sentencia.executeUpdate(sql);
   } catch (SQLException ex) {
      ex.printStackTrace();
   return false;
   }
 
   return true;
}

public ResultSet ejecutarSQL(String sql)
{
   ResultSet resultado;
   try {
      Statement sentencia = conexion.createStatement();
      resultado = sentencia.executeQuery(sql);
   } catch (SQLException ex) {
      ex.printStackTrace();
      return null;
   }
 
   return resultado;
}


    public Connection getConexion(){

        return conexion;

    }

 

    public abstract boolean cerrarConexion();

}