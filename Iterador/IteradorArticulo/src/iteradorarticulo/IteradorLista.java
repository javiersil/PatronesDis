/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteradorarticulo;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author cosma_000
 */
public class IteradorLista implements Iterador{
     private int index=0;
     private ArrayList lista;
     
     public IteradorLista(ArrayList l){
         
         this.lista = l;
     }
    
    
    
    @Override
    public boolean hasNext() {
        
        return index < lista.size() ;
    }

   @Override
    public Object next() {
        
    return lista.get(index++);
    }
    public void remove(){
    
    }
    
    public Object first(){
    
    return lista.get(0);
            }
    
   public Object last(){
       
       return lista.get(lista.size()-1);
  
   
   }
    
}
