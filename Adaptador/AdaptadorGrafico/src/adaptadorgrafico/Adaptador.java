/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptadorgrafico;

import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author cosma_000
 */
public class Adaptador implements Figura{
    
    private Texto texto ;
    private Graphics g;
    private Graphics2D gd; 
    
    public Adaptador(Graphics g){
    
    texto = new Texto("hola");
    this.gd = ( Graphics2D ) g;
    
    }
     public Adaptador(){
    
    }
    public void presentar(){
        texto.presentar();
          String cadena = texto.getText();
           
         
    
    gd.drawString(cadena, 150, 150);
    }
    public void girar(){
      
       gd.rotate(25,150,150);
      
       presentar();
  
   }

   
    
    
}
