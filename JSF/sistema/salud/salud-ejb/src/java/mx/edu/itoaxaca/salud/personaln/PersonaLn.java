/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.salud.personaln;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import mx.edu.itoaxaca.salud.dao.PersonaFacade;
import mx.edu.itoaxaca.salud.modelo.Persona;

/**
 *
 * @author PROPIETARIO
 */
@Stateless
@LocalBean
public class PersonaLn {

    @EJB
    private PersonaFacade personaFacade;
    
    public void agregar(Persona p){
       personaFacade.create(p);
    }
    
    public List<Persona> personas(){
    return personaFacade.findAll();
    }
    
    public void editar(Persona p){
    personaFacade.edit(p);
    }
    
    public int contar(){
    return personaFacade.count();
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
