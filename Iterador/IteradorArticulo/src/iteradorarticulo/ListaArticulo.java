/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteradorarticulo;

import java.util.ArrayList;


/**
 *
 * @author cosma_000
 */
public class ListaArticulo {
    private ArrayList<Articulo> articulos;
  
    
    public ListaArticulo(){
    
    this.articulos = new ArrayList<Articulo>() ;
    }
    public void imprimir(){
        
          Iterador ite = creaIterador();
        while(ite.hasNext()){
           System.out.println(ite.next().toString());
        }
    
    }
    public IteradorLista creaIterador(){
         return new IteradorLista(articulos); 
        
    }
    public void primero(){
           Iterador ite = creaIterador();
     System.out.println( ite.first().toString() );
    
    }
     public void ultimo(){
            Iterador ite = creaIterador();
     System.out.println( ite.last().toString() );
    
    }
    public void add(Articulo a){
        
        articulos.add(a);
    
    }
}
