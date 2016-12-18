/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteradores;

import java.util.ArrayList;
import java.util.Iterator;



/**
 *
 * @author cosma_000
 */
public  interface Iterador {     
 
   //public void Iterador();
  
    //public void Iterador(int i,int f);
    
    public boolean hasNext() ;


    public Object next() ;
   
    public Object first();
    
   public Object last(); 
}
