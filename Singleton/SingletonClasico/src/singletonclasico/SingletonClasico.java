/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonclasico;

/**
 *
 * @author cosma_000
 */
public class SingletonClasico {
      private static SingletonClasico instancia;
      private static int numIns=0;
      protected SingletonClasico(){
      numIns++;
      }
      /*
      static {
         instancia = new SingletonClasico();
      }
      */
      
    public static SingletonClasico GetInstancia(){
    if(instancia == null){
        instancia = new SingletonClasico();
    }
    System.out.println("se creo una instancia");
    return instancia;
    }
    public int numIns(){
      return numIns;
     }
}
    

