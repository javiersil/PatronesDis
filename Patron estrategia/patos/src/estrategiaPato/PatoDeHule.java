/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategiaPato;

import implementaciones.Silbar;
import implementaciones.NoVuelan;
import implementaciones.NoCamina;


/**
 *
 * @author cosma_000
 */
public class PatoDeHule extends Pato {
    
    public PatoDeHule(){
    super.sonido = new Silbar();
    super.volador = new NoVuelan();
     super.avanza = new NoCamina();
    }

    
    public void descripcion() {
       System.out.println("este pato es de Hule");
    }
    
   
    
}
