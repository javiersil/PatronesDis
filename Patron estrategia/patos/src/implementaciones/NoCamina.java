/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciones;
import comportamiento.Avanzar;

/**
 *
 * @author cosma_000
 */
public class NoCamina implements Avanzar{

    @Override
    public void camina() {
     System.out.println("no avanza");      
    }
    
}
