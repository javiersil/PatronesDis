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
public class Menu implements ComponenteMenu {

ArrayList <ComponenteMenu> menuComponentes = new ArrayList();

String nombre;

String descripcion;

  

public Menu(String nombre, String descripcion) {

this.nombre = nombre;

this.descripcion = descripcion;

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

 

public String getNombre() {

return nombre;

}

 

public String getDescripcion() {

return descripcion;

}

 

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
    public double getPrecio() {
    return 0.0;   
    }

    @Override
    public boolean isVegeneriano() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}