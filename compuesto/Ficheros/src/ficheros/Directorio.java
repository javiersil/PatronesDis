/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

/**
 *
 * @author javier
 */
public interface Directorio {
    
    public void add(Directorio menuComponente);

public void remove(Directorio menuComponente);

public Directorio getHijo(int i);

public String getNombre();

public String getDescripcion();

public int getPeso();

public void print();

}
