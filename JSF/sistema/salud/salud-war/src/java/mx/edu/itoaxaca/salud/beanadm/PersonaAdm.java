/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.salud.beanadm;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import mx.edu.itoaxaca.salud.modelo.Persona;
import mx.edu.itoaxaca.salud.personaln.PersonaLn;

/**
 *
 * @author PROPIETARIO
 */
@Named(value = "personaAdm")
@SessionScoped
public class PersonaAdm implements Serializable {

    @EJB
    private PersonaLn personaLn;
    
    
    private Persona persona;
     
    private LinkedList<String> nombresPer;
    private LinkedList<Integer> idsPer;
    
    private List<Persona> personas;
    private String nomPer;
    private Integer idP;
    
    
    /**
     * Creates a new instance of PersonaAdm
     */
    public PersonaAdm() {
    }
    
    public void edad(){
        FacesContext contexto = FacesContext.getCurrentInstance();
        FacesMessage mensaje = new FacesMessage(""+persona.getFechanac().getYear());
        contexto.addMessage(nomPer,mensaje);
    
    }   
    
    public void editar(ActionEvent e){
    personaLn.editar(persona);
    }
    
    public void asignarPersonas(ActionEvent e){
      personas = personaLn.personas();
      idsPer = new LinkedList<Integer>();
        for(Persona p :personas){
        idsPer.add(p.getIdpersona());
        }
    }
    
    public void asignarNomPers(){
    personas = personaLn.personas();
    nombresPer = new LinkedList<>();
    for(Persona p :personas){
    nombresPer.add(p.getNombre());
    }
    }
    
    
    public void mostrarPersona(){
    persona = personas.get(nombresPer.indexOf(nomPer));
    }
    
    public void crearPersona(ActionEvent e){
        persona = new Persona();
        //persona.setIdpersona(cidpersona());
    }
    
    public void AgregarPersona(ActionEvent e){
    personaLn.agregar(persona);
    }
    
    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
     public String getNomPer() {
        return nomPer;
    }

    public void setNomPer(String nomPer) {
        this.nomPer = nomPer;
    }
    
    public LinkedList<String> getNombresPer() {
        return nombresPer;
    }

    public void setNombresPer(LinkedList<String> nombresPer) {
        this.nombresPer = nombresPer;
    }
    
}
