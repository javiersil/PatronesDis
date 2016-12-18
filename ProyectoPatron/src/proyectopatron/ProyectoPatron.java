/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopatron;

import Consultas.ConsultaUsuario;


/**
 *
 * @author cosma_000
 */
public class ProyectoPatron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ConsultaUsuario c = new ConsultaUsuario();
       c.consultarByID("1");
       //c.consultartodos();
     //  c.consultarByNombre("'marcos'");
       
    }
    
}
