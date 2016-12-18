/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JCheckBox;


/**
 *
 * @author cosma_000
 */
public class ComponenteSexo extends JPanel{
    private ButtonGroup grupo;
   private JCheckBox mujer;
   private JCheckBox hombre;
   
    
    public ComponenteSexo(){
        mujer = new JCheckBox("mujer");
        hombre = new JCheckBox("hombre");
        grupo = new ButtonGroup();
        grupo.add(mujer);
        grupo.add(hombre);
         this.add(mujer);
         this.add(hombre);
        
    }
  public String getSelected(){
  if(mujer.isSelected()){
  return mujer.getLabel();
  }else if(hombre.isSelected()){
  return hombre.getLabel();}else return null;
  }
    
    
}
