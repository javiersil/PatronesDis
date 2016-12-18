/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.salud.personaadm;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.inject.Any;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import mx.edu.itoaxaca.salud.modelo.Persona;
import mx.edu.itoaxaca.salud.personaln.PersonaLn;

/**
 *
 * @author cosma_000
 */
@Named(value = "personaAdmin")
 
@SessionScoped
public class PersonaAdmin implements Serializable { 
    private List<Persona> personas;
    private LinkedList<Integer> idper;
    private LinkedList<String> nombresPer;
   private String nombre;
    private Persona persona;
    private boolean dd=false;
    @EJB
    private PersonaLn personaLn;
    
    /**
     * Creates a new instance of PersonaAdmin
     */
      public void edad(){
        FacesContext contexto = FacesContext.getCurrentInstance();
        FacesMessage mensaje = new FacesMessage(""+persona.getFechanac().getYear());
        contexto.addMessage(nombre,mensaje);
    
    } 
    /*public void creaPersona(ActionEvent e){
     persona = new Persona();
     persona.setIdpersona(personaLn.contar());
    }*/
    public boolean getDd(){
    return dd;
    }
    public void setDd(boolean d){
     dd=d;
    }
    
     public void creaPersona(ActionEvent e){
        persona = new Persona();
        personas = personaLn.personas();        
        idper = new LinkedList<Integer>();
        nombresPer = new LinkedList<String>();
        for(Persona p:personas){            
            idper.add(p.getIdpersona());
        }   
           persona.setIdpersona(maxiPer());
    }
    public int maxiPer(){
        
        return idper.getLast() + 1;
    }
    
    
    public void agregarPersona(ActionEvent e){
        if(personaLn.agregar(persona)){
        FacesContext contexto = FacesContext.getCurrentInstance();
        FacesMessage mensaje = new FacesMessage("Se agrego");
        contexto.addMessage(nombre,mensaje);
        setDd(false);
        
         persona = new Persona();
        personas = personaLn.personas();        
        idper = new LinkedList<Integer>();
        nombresPer = new LinkedList<String>();
        for(Persona p:personas){            
            idper.add(p.getIdpersona());
        }   
           persona.setIdpersona(maxiPer());
        
    
        }else {
            setDd(true);
        FacesContext contexto = FacesContext.getCurrentInstance();
        
        FacesMessage mensaje = new FacesMessage("no se agrego");
        contexto.addMessage(nombre,mensaje);
    
        
             }
    
    }
    
    
    
    public PersonaAdmin() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getPersonas() {
        return this.personaLn.personas();
    }

  
    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    
     public void editarPersona(ActionEvent e){
     personaLn.editar(persona);
     }
   
     public void setNombre(String a){
     this.nombre= a;
     }
     public String getNombre(){
     return this.nombre;
             }
  
     
     public void asignarPersonas(ActionEvent e){
      personas = personaLn.personas();
      idper = new LinkedList<Integer>();
        for(Persona p :personas){
        idper.add(p.getIdpersona());
     }
    }
    public void guardar(ActionEvent e){
        personaLn.editar(persona);
          setDd(false);
    }
    public void asignarNomPers(){
    personas = personaLn.personas();
    nombresPer = new LinkedList<>();
    for(Persona p :personas){
    nombresPer.add(p.getNombre());
    }
    }
    
     public void mostrarPersona(){
    persona = personas.get(nombresPer.indexOf(nombre));
    }
     
     public LinkedList<String> getNombresPer() {
        return nombresPer;
    }
}
