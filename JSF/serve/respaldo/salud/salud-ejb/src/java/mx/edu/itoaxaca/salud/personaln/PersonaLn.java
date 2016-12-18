/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.salud.personaln;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.enterprise.inject.Any;

import mx.edu.itoaxaca.salud.dao.PersonaFacade;
import mx.edu.itoaxaca.salud.modelo.Persona;

/**
 *
 * @author Friday
 */
@Stateless
@LocalBean
public class PersonaLn {
    @Any
  private Persona persona;
    @EJB
    private PersonaFacade personaFacade;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public void agregar(Persona p){
    personaFacade.create(p);
   
    
    }
}
