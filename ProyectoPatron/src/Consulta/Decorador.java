/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Consulta;

/**
 *
 * @author cosma_000
 */
public abstract class Decorador extends ConsultaSQL{
 protected ConsultaSQL c;
 
 public Decorador(ConsultaSQL con){
 this.c= con;
 }
}
