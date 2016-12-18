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
public class Carpeta implements Directorio {
    
ArrayList <Directorio> fichero = new ArrayList();

private String nombre;

private String descripcion;
private int peso;



public Carpeta(String n, String d){
    this.nombre = n;
    this.descripcion= d;
  
    


}

public int calculaPeso(){
int p=0;
Iterator iterador = fichero.iterator();

while(iterador.hasNext()){
    
   Directorio f= (Directorio)iterador.next();
  
 p += f.getPeso();

}
return p;
        
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
@Override
    public int getPeso() {
        
        int p=0;
Iterator iterador = fichero.iterator();

while(iterador.hasNext()){
    
   Directorio f= (Directorio)iterador.next();
  
 p += f.getPeso();

}

        
       peso= p;
    return this.peso;
    }

    @Override
    public void print() {
    
        System.out.print( " Carpeta: "+ getNombre());

System.out.print(", Descripcion: " + getDescripcion() );

System.out.println(",  Peso: " + getPeso()+ " MB " );

System.out.println("---------------------  "  );

Iterator iterador = fichero.iterator();

while(iterador.hasNext()){
    
   Directorio f= (Directorio)iterador.next();
    System.out.print("\t");
  f.print();

}
        
    }
    
}
