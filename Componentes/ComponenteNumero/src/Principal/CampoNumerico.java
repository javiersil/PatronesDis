package Principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
/**
 *
 * @author cosma_000
 */
public class CampoNumerico extends JTextField {
    private int nDigitos;
    private int valor;
  
    
    public CampoNumerico(){
        
		super();
                this.setText("");
		this.setColumns(nDigitos + 1);
		valor = 0;
                 this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnKeyTyped(evt);
            }
        });
  
	}

	public void setNDigitos(int n){
		nDigitos = n;
		this.setColumns(nDigitos + 1);
	}

	public int getValor(){
         
		if(this.getText().equals(""))
			valor = 0;
		else
			valor = Integer.parseInt(this.getText());
		return valor;
           
	}

        
       
	public void tnKeyTyped(KeyEvent e){
            
		char k = (Character) e.getKeyChar();
             
		if(!Character.isDigit(k) || this.getText().length() == nDigitos )                   
			 e.consume();
               
               
        
        }

        
        

   

        
    
}
