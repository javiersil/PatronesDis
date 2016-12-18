/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategiaPato;

import comportamiento.Voladores;
import comportamiento.Sonidos;
import comportamiento.Avanzar;

/**
 *
 * @author cosma_000
 */
public abstract class Pato {
    Sonidos sonido;
    Voladores volador;
    Avanzar avanza;
    
    
     public void suSonido(){
    sonido.sonido();
    
    }
    public void vuela(){
    volador.volar();
   }
    public void avanza(){
    avanza.camina();
    }
   public abstract void descripcion();
}
