/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategiaPato;

import implementaciones.NoVuelan;
import implementaciones.NoSuenan;
import implementaciones.SiCaminan;

/**
 *
 * @author cosma_000
 */
public class PatoConCuerda extends Pato{
    
    
     public PatoConCuerda(){
    super.sonido = new NoSuenan();
    super.volador = new NoVuelan();
    super.avanza = new SiCaminan();
    }

    @Override
    public void descripcion() {
     System.out.println("Este es un pato que se le da cuerda");     
    }
    
}
