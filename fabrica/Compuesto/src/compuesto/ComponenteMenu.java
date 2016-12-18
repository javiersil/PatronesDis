/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compuesto;

/**
 *
 * @author javier
 */
public interface ComponenteMenu {

public void add(ComponenteMenu menuComponente);

public void remove(ComponenteMenu menuComponente);

public ComponenteMenu getHijo(int i);

public String getNombre();

public String getDescripcion();

public double getPrecio();
public void print();
public boolean isVegeneriano();
}
