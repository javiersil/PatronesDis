/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consulta;
import static Conectores.ConectorMysql.getConectorMysql;
import Conectores.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cosma_000
 */
public abstract class ConsultaSQL {
    protected String sql="";
    protected String tabla;
    protected Conexion con;
    private ResultSet rs=null;
    public void setTabla(String t){
    tabla= t;
    }
   public void setConector(){
  con = getConectorMysql();
   }
    public abstract void ampliar();
    public void setSQL(String s){
    sql= s;
    }
    public String getSQL(){
    return sql;
    }
    
    public String getDriverC(){
         setConector();
             
    return  con.getDriver();
    }
   
    public  ResultSet executeSQL(){
       
        try
            {
                
        setConector();
             
               con.setConexion();
                
              
                rs=  con.ejecutarSQL(getSQL());
                 System.out.println(getSQL());
                   
                     setSQL("");     
              
                  return rs; 
            
            }
       catch(Exception e)
            {
                
                   System.out.println(e.getMessage());
                   
     
            }
     return rs;
    }
    public void cerrar(){
    
        try {
            rs.close();
            con.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
                  
          
    
    }
}
