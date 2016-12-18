/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrategiaPato;

/**
 *
 * @author cosma_000
 */
public class Estrategia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        PatoDeHule pato1 = new PatoDeHule();
        pato1.descripcion();
         pato1.suSonido();
         pato1.vuela();
       
         
          PatoDeMadera pato2 = new PatoDeMadera();
           pato2.descripcion();
         pato2.suSonido();
         pato2.avanza();
         pato2.vuela();
    
    
    }
    
}
