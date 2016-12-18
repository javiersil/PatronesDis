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
public class CampoNumericoString extends JTextField {
    private int nDigitos;
    private int tmp;
    private int nFloat;
    private int valor;
    private boolean letras=true;
    private boolean numeros=false;
    private boolean flotantes= false;
    private boolean bandera=false;
    public CampoNumericoString(){
        
		super();
                this.setText("");
		this.setColumns((nDigitos+ nFloat) + 2 );
		valor = 0;
                 this.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tnKeyTyped(evt);
            }
        });
  
	}

	public void setNDigitos(int n){
		
                nDigitos = n;
                
                   // this.setColumns(nDigitos);
                   colum();
	}
        public void setNDecimal(int n){
            if(flotantes){
                nFloat= n;
           // this.setColumns((nDigitos + nFloat)+ 2);
            
            }
            colum();
        }
        public void colum(){
             if(flotantes){
        this.setColumns((nDigitos + nFloat)+ 2);
         }else this.setColumns(nDigitos+1);
             }
       
	public Object getValor(){
            if(numeros){
		if(this.getText().equals(""))
			valor = 0;
		else
			valor = Integer.parseInt(this.getText());
		return valor;
            }else return this.getText();
	}
        
      public Double getValorDecimal(){
          
      return Double.parseDouble(this.getText());
              }  
        
public void setLetra(boolean f){
        this.numeros= !f;
 this.letras=f;
 this.flotantes=!f;

}
public void setNumeros(boolean f){
    this.letras=!f;
this.numeros=f;
this.flotantes=!f;


}
public void setDecimal(boolean f){
this.letras=!f;
this.flotantes=f;
this.numeros=!f;
}
public boolean getDecimal(){
return this.flotantes;
}
public boolean getLetra(){
return letras;
}
public boolean getNumeros(){
return numeros;
}
        
       
	public void tnKeyTyped(KeyEvent e){
            char k = (Character) e.getKeyChar();
            if(letras){
		  if(Character.isDigit(k) ||this.getText().length() == nDigitos)
                     e.consume();
		
                }else if(numeros){
             
               if(!Character.isDigit(k) || this.getText().length() == nDigitos )                   
			 e.consume();
               }
                else if(flotantes){
                    if(k != '.' ){
                        if(bandera){
                           
                          if(!Character.isDigit(k) || this.getText().length() == ( nDigitos + tmp  ) )                   
			 e.consume();
                          
                        }else 
                              if(!Character.isDigit(k) || this.getText().length() == (nDigitos ) )                   
			 e.consume();
                        
                    
               }
                    if(k == '.'){
                    bandera=true;
                    tmp = this.getText().length() + nFloat;
                    }
                    
                    
                    
                    
                }
                }
	    
        
        
        }

        
        

   

        
    

