/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import Objetos.Alumno;
import Iteradores.IteradorArreglo;
import Iteradores.Iterador;



/**
 *
 * @author javier
 */
public class ArregloAlumno {
    private Alumno alumnos[];
    private int apuntador=0;
     public ArregloAlumno(Alumno []a){
    alumnos = a;
    }
       public ArregloAlumno(int n){
       
       this.alumnos = new Alumno[n];
       }
       
    public void imprimir(){
        
          Iterador ite = creaIterador();
        while(ite.hasNext()){
           System.out.println(ite.next().toString());
        }
    
    }
    public IteradorArreglo creaIterador(){
         return new IteradorArreglo(alumnos); 
        
    }
     /*public IteradorRango creaIterador(int i, int f){
         return new IteradorRango(alumnos,i,f); 
        
    }*/
    public void primero(){
           Iterador ite = creaIterador();
     System.out.println( ite.first().toString() );
    
    }
     public void ultimo(){
            Iterador ite = creaIterador();
     System.out.println( ite.last().toString() );
     
    
    }
    public void add(Alumno a){
         Iterador ite = creaIterador();
         boolean f= true;
         while(ite.hasNext() && f){
      if( alumnos[apuntador] != null){ 
      alumnos[apuntador]=a;
      f= false;
      }
      apuntador++;
      
         }
    
    }/*

    public void rango(int i, int f){
         IteradorRango ite = creaIterador(i,f);
         while(ite.hasNext())
   System.out.println( ite.next().toString() );
    }*/
}
