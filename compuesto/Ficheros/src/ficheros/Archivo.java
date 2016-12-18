/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author javier
 */
public class Archivo implements Directorio
{
  ArrayList <Directorio> fichero = new ArrayList();


  private String nombre;

private String descripcion;

private String extencion;

int peso;



public Archivo(String n, String d, String e , int p){
    this.nombre = n;
    this.descripcion= d;
    this.extencion= e;
    
     this.peso= p;


}

    @Override
    public void add(Directorio f) {
      fichero.add(f);
    
    }

    @Override
    public void remove(Directorio f) {
    fichero.remove(f);
    }

    @Override
    public Directorio getHijo(int i) {
    return fichero.get(i);
    }

    @Override
    public String getNombre() {
       
    return this.nombre;
    }

    @Override
    public String getDescripcion() {
    return this.descripcion;
    }

    
    public String getExtencion() {
    return this.extencion;
    }
@Override
    public int getPeso() {
       return peso;
    }
    
    @Override
    public void print() {
    
        System.out.print( " \t Archivo: "+  getNombre());

System.out.print(", Descripcion: " + getDescripcion() );

System.out.print(", Peso: " + getExtencion() );


System.out.println(", " + getPeso()  +" MB ");

System.out.println("---------------------  "  );

Iterator iterador = fichero.iterator();

while(iterador.hasNext()){
   Directorio f= (Directorio)iterador.next();
   System.out.print("\t");
  f.print();

}
        
    }

    
}
