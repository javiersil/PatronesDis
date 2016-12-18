/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategiaPato;

import implementaciones.NoCamina;
import implementaciones.NoVuelan;
import implementaciones.NoSuenan;

/**
 *
 * @author cosma_000
 */
public class PatoDeMadera extends Pato {
     public PatoDeMadera(){
    super.sonido = new NoSuenan();
    super.volador = new NoVuelan();
       super.avanza = new NoCamina();
    }

    @Override
    public void descripcion() {
    System.out.println("Este pato es de madera");   
    }
}
