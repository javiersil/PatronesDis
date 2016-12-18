/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author javier
 */
public class Alumno {
    private String nombre;
    private int numeroDeControl;
    private int semestre;
    
    public Alumno(String d,int c, int p){
      this.nombre =d;     
      this.numeroDeControl=c;
      this.semestre= p;
    
    
    }
    
    
    public String toString(){
    
    return "nombre: " + this.nombre+ " numero de control: " + this.numeroDeControl+ " semestre: " + this.semestre;
    }
    
}
