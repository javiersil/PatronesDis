/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pureba;

import Objetos.Alumno;
import listas.ArregloAlumno;
import Objetos.Articulo;
import listas.ListaAlumno;
import listas.ListaArticulo;

/**
 *
 * @author cosma_000
 */

public class IteradorArticulo {

public void articulo(){
    ListaArticulo la= new ListaArticulo();
            Articulo a1 = new Articulo("articulo 1",1,10.0);
            Articulo a2 = new Articulo("articulo 2",1,9.0);
            Articulo a3 = new Articulo("articulo 3",1,4.0);
            Articulo a4 = new Articulo("articulo 4",1,7.0);
           
        la.add(a1);
         la.add(a2);
          la.add(a3);
           la.add(a4);
           
           la.imprimir();
           System.out.println("primero");
           la.primero();
             System.out.println("ultimo");
           la.ultimo();
}
  

public void alumno(){
    ListaAlumno la= new ListaAlumno();
            Alumno a1 = new Alumno("marcos",11,9);
            Alumno a2 = new Alumno("javier",12,9);
            Alumno a3 = new Alumno("jesus",13,9);
            Alumno a4 = new Alumno("paco",14,9);
           
        la.add(a1);
         la.add(a2);
          la.add(a3);
           la.add(a4);
           
           la.imprimir();
           System.out.println("primero");
           la.primero();
             System.out.println("ultimo");
           la.ultimo();
           
           
            System.out.println("rango");
           la.rango(1, 3);
}


public void alumnoArreglo(){
 
     Alumno listaAlumno[]= new Alumno[4];
           listaAlumno[0]= new Alumno("marcos",11,9);
           listaAlumno[1]= new Alumno("javier",12,9);
            listaAlumno[2]= new Alumno("jesus",13,9);
            listaAlumno[3]= new Alumno("paco",14,9);
           
       
           ArregloAlumno la= new ArregloAlumno(listaAlumno);
          
           la.imprimir();
           System.out.println("primero");
           la.primero();
             System.out.println("ultimo");
           la.ultimo();
           
           
            //System.out.println("rango");
           //la.rango(1, 3);
}



/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         IteradorArticulo  ia = new  IteradorArticulo ();
         System.out.println("alumnos");
        // ia.alumno();
          //System.out.println("articulos");
         //ia.articulo();
      ia.alumnoArreglo();
    }
    
}
