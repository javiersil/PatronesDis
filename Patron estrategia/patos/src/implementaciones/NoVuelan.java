/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;

import comportamiento.Voladores;

/**
 *
 * @author cosma_000
 */
public class NoVuelan implements Voladores{

    @Override
    public void volar() {
    System.out.println("No vuelan");    
    }
    
}
