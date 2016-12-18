/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonclasico;

import singletondeprueba.OtroCreador;

/**
 *
 * @author cosma_000
 */
public class Prueba {
    
    public static void main(String []arg){
    
    SingletonClasico sclasico1 = SingletonClasico.GetInstancia();
    System.out.println( "Primera Instancia  "+  sclasico1.numIns());
   /* 
    SingletonClasico sclasico2 = SingletonClasico.GetInstancia();
    System.out.println( "Instancia 2  "+  sclasico2.numIns());
    
     SingletonClasico sclasico3 = SingletonClasico.GetInstancia();
    System.out.println(   "Instancia 3  "+   sclasico3.numIns());
    */
   
      OtroCreador otro = new OtroCreador();
    System.out.println(   "Instacia de otro creador "+   otro.getNumIns());
   
   
    }
    
}
