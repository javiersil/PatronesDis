/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compuesto;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author javier
 */
public class ElementoMenu implements ComponenteMenu {
    ArrayList menuComponentes = new ArrayList();

String nombre;

String descripcion;

boolean vegetariano;

double precio;    

public ElementoMenu(String nombre, 

               String descripcion, 

               boolean vegetariano, 

               double precio) 

    { 

this.nombre = nombre;

this.descripcion = descripcion;

this.vegetariano = vegetariano;

this.precio = precio;

    }

public String getNombre() {

return nombre;

}

public String getDescripcion() {

return descripcion;

}

public double getPrecio() {

return precio;
}

  
public void add(ComponenteMenu menuComponente) {

menuComponentes.add(menuComponente);

}

 

public void remove(ComponenteMenu menuComponente) {

menuComponentes.remove(menuComponente);

}

 

public ComponenteMenu getHijo(int i) {

return (ComponenteMenu)menuComponentes.get(i);

}

    @Override
    public void print() {
        
        System.out.print("\n" + getNombre());

System.out.println(", " + getDescripcion());

System.out.println("---------------------");
      
    Iterator iterador = menuComponentes.iterator();

while(iterador.hasNext()){
   ComponenteMenu menucomponente = (ComponenteMenu)iterador.next();
  menucomponente.print() ;

}
    }

    @Override
    public boolean isVegeneriano() {
    return this.vegetariano;    
    }


}