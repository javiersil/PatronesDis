/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.salud.personaadm;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.inject.Any;
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
   
    private Persona persona;
    @EJB
    private PersonaLn personaLn;
    
    /**
     * Creates a new instance of PersonaAdmin
     */
    public void creaPersona(ActionEvent e){
     persona = new Persona();
    }
    public void agregarPersona(ActionEvent e){
    personaLn.agregar(persona);
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
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    
}
