/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteradores;

import Iteradores.Iterador;
import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class IteradorRango implements Iterador{
     private int index;
     private int tope;
     private ArrayList lista;
     
     public IteradorRango(ArrayList l, int i, int f){
        lista= l;
        index=i;
        tope=f;
    
    
     }
    
    
   
   
    public boolean hasNext() {
        
        return index < lista.size() ;
    }

   
    public Object next() {
        if(hasNext()){
        
    return lista.get(index++);
    }
        return null;
    }
   
    
    public Object first(){
    
    return lista.get(0);
            }
    
   public Object last(){
       
       return lista.get(lista.size()-1);
  
   
   }
  
}
