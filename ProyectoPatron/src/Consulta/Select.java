/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consulta;

/**
 *
 * @author cosma_000
 */
public class Select extends Decorador{
    
    
        private String select;
  
    
    public Select(ConsultaSQL con){
    super(con);
    select = generaSelect(super.c.tabla);
    }
    
    public  Select(ConsultaSQL con,String s) {
       super(con);
        select = generaSelect(s);
        
    }
     public  Select(ConsultaSQL con,String s, String a[]) {
       super(con);
        select = generaSelect(s);
        
    }
    
    public String generaSelect(String s){
        String c="";
       
      switch(super.c.getDriverC()){
           case "mysql":  {c = " SELECT * FROM "+ s;} break;
           case "posrtgreSQL": { c = " SELECT * FROM "+ s;} break;
    } 
      return c;
    
    }
   
    @Override
    public void ampliar() {
     String s= super.c.getSQL()+select;
        
         super.setSQL(s);
        
        
    }
    
   

    
}
