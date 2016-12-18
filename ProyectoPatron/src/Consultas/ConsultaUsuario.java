/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consultas;
import static Conectores.ConectorMysql.getConectorMysql;
import Conectores.Conexion;
import Consulta.ConsultaSQL;
import Consulta.Consultar;
import Consulta.Where;
import Consulta.Select;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author cosma_000
 */
public class ConsultaUsuario  {
     private ConsultaSQL cu ;
     private String tabla="usuarios";
    public ConsultaUsuario(){
    cu = new Consultar();
      
   
    }
   
    
    public void consultarByID(String id){
    cu.setTabla(tabla);
        cu = new Select(cu);
        cu.ampliar();
       // cu= new Where(cu,"id",id);        
        //cu.ampliar();
    ResultSet rs= cu.executeSQL();
    
         try {
               
             while(rs.next()){
                 System.out.println(rs.getString("id"));
                 System.out.println(rs.getString("nombre"));
             }
             cu.cerrar();
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
    
    }
     public void consultartodos(){
         
    cu.setTabla(tabla);
    cu = new Select(cu);
        cu.ampliar();
   
    ResultSet rs= cu.executeSQL();
    
         try {
               
             while(rs.next()){
                 System.out.println(rs.getString("id"));
              
             }
             cu.cerrar();
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
    
    }

     public void consultarByNombre(String n){
    cu.setTabla(tabla);
    cu = new Select(cu);
        cu.ampliar();
      cu= new Where(cu,"nombre",n);        
        cu.ampliar();
    ResultSet rs= cu.executeSQL();
    
         try {
               
             while(rs.next()){
                 System.out.println(rs.getString("nombre"));
              
             }
             cu.cerrar();
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
    
    }
    
}
