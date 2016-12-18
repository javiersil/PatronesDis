/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import ventanaunica.Ventana1;

/**
 *
 * @author cosma_000
 */
public class VentanaUnica {

    
  public static void main(String args[]) {
          
               
       
        
  
               Ventana1 ventana = Ventana1.GetInstancia() ;
               ventana.setVisible(true);
               
                Ventana1 ventana2 = Ventana1.GetInstancia() ;
               ventana2.setVisible(true);
    
    }
}
