/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondeprueba;

import singletonclasico.SingletonClasico;

/**
 *
 * @author cosma_000
 */
public class OtroCreador {
    
    private SingletonClasico instancia;
    private SingletonClasico otrainstancia;
    
    public OtroCreador(){
    instancia = SingletonClasico.GetInstancia();
    //otrainstancia = new SingletonClasico();
    
    }
    
    public int getNumIns(){
          //return otrainstancia.numIns();
    return instancia.numIns();
    
    }
}
