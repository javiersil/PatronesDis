/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iteradores;

import Iteradores.Iterador;

/**
 *
 * @author javier
 */
public class IteradorArreglo implements Iterador {
     private  Object arreglo[];
     private int index;
    
    public IteradorArreglo(Object a[]){
    this.arreglo = a;
    
    }
     
     
     @Override
     public boolean hasNext() {
       return index < arreglo.length;
    }

    @Override
    public Object next() {
     
        return arreglo[index++];
    }

   

    @Override
    public Object first() {
      return arreglo[0];
    }

    @Override
    public Object last() {
    return arreglo[arreglo.length -1];
    }
    
     
    
}
