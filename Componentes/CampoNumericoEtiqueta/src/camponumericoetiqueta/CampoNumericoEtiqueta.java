package camponumericoetiqueta;

import javax.swing.JLabel;
import javax.swing.JPanel;
import Principal.CampoNumerico;

/**
 *
 * @author cosma_000
 */
public class CampoNumericoEtiqueta extends JPanel{
  private JLabel titulo ;
  private CampoNumerico campoNumerico1;
  private String pos[]={"izquierda","derecha"};
  private boolean anterior;
  private boolean posterior;
  
  
  public CampoNumericoEtiqueta(){
      campoNumerico1 = new CampoNumerico();   
       titulo = new JLabel();
      
      this.add(campoNumerico1);
      this.add(titulo);
      
      
  
  }
  
  public void setPosicion(boolean t){
   int x=0;
      if(!t) x=1;          
  this.setComponentZOrder(titulo, x);
 

      
  }
  /*
  public boolean setDerecha(){
      
  return anterior;
  }
  public boolean setIzquierda(){
    
  return posterior;
  */
   public void setTitulo(String t){
  titulo.setText(t);
  }
  public void setAnterior(boolean b){
  anterior = b;
  }
  public void setPosterior(boolean b){
  posterior = b;
  }
  public int getValor(){
  return campoNumerico1.getValor();
  }
  public void setDigitos(int a){
   campoNumerico1.setNDigitos(a);
  }
  
  
    
}

