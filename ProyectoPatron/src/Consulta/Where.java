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
public class Where extends Decorador{
    private String columna;
    private String valor;
    private String operador;
    
    public Where(ConsultaSQL con){
    super(con);
    }
    public  Where(ConsultaSQL con,String colum, String valor) {
       super(con);
        columna = colum;
        this.valor= valor;
        this.operador= " = ";
        
    }
     public Where(ConsultaSQL con,String colum,String o, String valor) {
        super(con);
        columna = colum;
        this.valor= valor;
        this.operador= " " +o+" ";
    }


      public String generaWhere(){
        String c="";
       
      switch(super.c.getDriverC()){
           case "mysql":  {c=" WHERE "+ columna + operador + valor;} break;
           case "posrtgreSQL": { c = " WHERE "+ columna + operador + valor; } break;
    } 
      return c;
    
    }
     
    @Override
     public void  ampliar() {
     String s= super.c.getSQL()+ generaWhere();
        
         super.setSQL(s);
        
        
    }
    
   

 
    
    
}
