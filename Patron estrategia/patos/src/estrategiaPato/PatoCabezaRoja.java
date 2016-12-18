/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategiaPato;

import implementaciones.VolarConAlas;
import implementaciones.Grasna;
import implementaciones.SiCaminan;


/**
 *
 * @author cosma_000
 */
public class PatoCabezaRoja extends Pato {
  
    
     public PatoCabezaRoja(){
    super.sonido = new Grasna();
    super.volador = new VolarConAlas();
     super.avanza = new SiCaminan();
    }

    @Override
   
    public void descripcion() {
    System.out.println("Este pato si tiene  vida");   
    }  
    
}
