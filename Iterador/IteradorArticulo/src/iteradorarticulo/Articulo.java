/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteradorarticulo;

/**
 *
 * @author cosma_000
 */
public class Articulo {
    private String descripcion;
    private int cantidad;
    private double precio;
    
    public Articulo(String d,int c, double p){
      this.descripcion =d;     
      this.cantidad=c;
      this.precio= p;
    
    
    }
    
    
    public String toString(){
    
    return "Descipcion: " + this.descripcion + " cantidad: " + this.cantidad + " precio: " + this.precio;
    }
    
}
