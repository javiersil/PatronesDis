/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.JPanel;
import Auxiliar.Spinner;
/**
 *
 * @author cosma_000
 */
public class Edad extends JPanel {
   private Spinner edad;
    public Edad(){
    edad = new Spinner();
    edad.setEtiqueta("edad");
    edad.setValorInicial(0);
    edad.setMaximo(120);
    edad.setMinimo(0);
    this.add(edad);
    }
    public void setMaximo(int x){
        this.edad.setMaximo(x);
    }
    public int getMaximo(){
    return this.edad.getMaximo();
    }
    public void setMinimo(int x){
    this.edad.setMinimo(x);
    }
    public int getMinimo(){
    return this.edad.getMinimo();
    }
    public int getEdad(){
    return this.edad.getValor();
    }
}
