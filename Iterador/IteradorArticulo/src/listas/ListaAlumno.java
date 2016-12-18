/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import Objetos.Alumno;
import Iteradores.IteradorRango;
import Iteradores.IteradorLista;
import Iteradores.Iterador;
import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class ListaAlumno {
     private ArrayList<Alumno> alumnos;
  
    
    public ListaAlumno(){
    
    this.alumnos = new ArrayList<Alumno>() ;
    }
    public void imprimir(){
        
          Iterador ite = creaIterador();
        while(ite.hasNext()){
           System.out.println(ite.next().toString());
        }
    
    }
    public IteradorLista creaIterador(){
         return new IteradorLista(alumnos); 
        
    }
     public IteradorRango creaIterador(int i, int f){
         return new IteradorRango(alumnos,i,f); 
        
    }
    public void primero(){
           Iterador ite = creaIterador();
     System.out.println( ite.first().toString() );
    
    }
     public void ultimo(){
            Iterador ite = creaIterador();
     System.out.println( ite.last().toString() );
     
    
    }
    public void add(Alumno a){
        
        alumnos.add(a);
        
    
    }
    public void rango(int i, int f){
         Iterador ite = creaIterador(i,f);
         while(ite.hasNext())
   System.out.println( ite.next().toString() );
    
    }
   
}
