/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptadorgrafico;

import javax.swing.JLabel;


/**
 *
 * @author cosma_000
 */
public class Texto extends JLabel{
    private String texto;
    public Texto(String t){
    texto = t;
    
    }
  
    public JLabel presentar(){
    this.setText(texto);
    return this;
    }
    
    public JLabel girar(){
        
        
    return this;
    }
    
    
}
