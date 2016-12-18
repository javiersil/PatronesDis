/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Auxiliar.Spinner;
import javax.swing.JPanel;

/**
 *
 * @author cosma_000
 */
public class Estatura extends JPanel{
      private Spinner cm;
      private Spinner m;
    public Estatura(){
    cm = new Spinner();
    cm.setEtiqueta("cm");
    cm.setValorInicial(0);
    cm.setMaximo(99);
    cm.setMinimo(0);
    m = new Spinner();
    m.setEtiqueta("m");
    m.setValorInicial(0);
    m.setMaximo(2);
    m.setMinimo(0);
    this.add(m);
    this.add(cm);
    }
    public void setMaximo(int x){
        this.m.setMaximo(x);
    }
    public int getMaximo(){
    return this.m.getMaximo();
    }
    public void setMinimo(int x){
    this.m.setMinimo(x);
    }
    public int getMinimo(){
    return this.m.getMinimo();
    }
    public float getEstatura(){
        float a = this.cm.getValor() * 0.01F;
    return this.m.getValor() + a;
    }
}
