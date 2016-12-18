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
public class IteradorArticulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaArticulo la= new ListaArticulo();
            Articulo a1 = new Articulo("articulo 1",1,10.0);
            Articulo a2 = new Articulo("articulo 2",1,9.0);
            Articulo a3 = new Articulo("articulo 3",1,4.0);
            Articulo a4 = new Articulo("articulo 4",1,7.0);
           
        la.add(a1);
         la.add(a2);
          la.add(a3);
           la.add(a4);
           
           la.imprimir();
           System.out.println("primero");
           la.primero();
             System.out.println("ultimo");
           la.ultimo();
    }
    
}
