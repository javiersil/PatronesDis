/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Principal.CampoNumericoString;
/**
 *
 * @author cosma_000
 */
public class ComponenteEdad extends JPanel{
     private JLabel etiqueta;
     private String texto="Edad";
     
       
     
     private CampoNumericoString  edad;
  
    public ComponenteEdad(){
    etiqueta = new JLabel(texto);
    
    
    edad =new CampoNumericoString();
   edad.setNDigitos(3);
   edad.setNumeros(true);
   
    this.add(etiqueta);
    this.add(edad);
   
    
  }  
    public int getEdad(){
      
    return (Integer) edad.getValor();
    }
    
    
}
