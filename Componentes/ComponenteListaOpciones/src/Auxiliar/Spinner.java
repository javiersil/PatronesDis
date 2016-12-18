/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auxiliar;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author cosma_000
 */
public class Spinner extends JPanel {
    private JLabel etiqueta;
    private JSpinner spinner;
    private int max=10;
    private int min=0;
    private int salto=1;
    private int valorD=0;
    private  SpinnerModel model;
    
    public Spinner(){
        this.etiqueta = new JLabel();
        
      
      
     spinner = new JSpinner();
        
        this.add(etiqueta);
        this.add(spinner);
    }
    
    public void setMaximo(int x){
    this.max=x;
     modelo();
    }
    public void setMinimo(int x){
    this.min=x;
     modelo();
    }
    public void setSalto(int x){
    this.salto=x;
    modelo();
    }
    public void setValorInicial(int x){
    this.valorD=x;
    modelo();
    }
    public void setEtiqueta(String g){
    this.etiqueta.setText(g);
    
    }
    public int getSalto(){
    return this.salto; 
    }
    public int getValorInicial(){
    return this.valorD;
    }
    public int getMinimo(){
    return this.min;
    }
    public int getMaximo(){
    return this.max;
    }
    
    public int getValor(){
    return Integer.parseInt( this.spinner.getValue().toString());
    
    }
    
    public void modelo(){
     model = new SpinnerNumberModel(this.getValorInicial(),this.getMinimo(), this.getMaximo(), this.getSalto()); 
     spinner.setModel(model);
     
     
    }
    
}
