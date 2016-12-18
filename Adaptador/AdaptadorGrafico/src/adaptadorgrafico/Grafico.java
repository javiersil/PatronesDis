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
public class Grafico implements Figura {
    
      private Graphics2D g ;
      private int x;
      private int y;
      public Grafico(){}
      public Grafico(Graphics g){
      this.g = (Graphics2D)g;
      
      }
    
    public void presentar( ){
  
         x=50;
         y= 70;
        
         
        g.drawRect (150, 150, x, y);
  
    
    }
    public void girar(){
       
         g.rotate(25,150,150);
       presentar();
   }
}
