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
    
    public boolean agregar(Persona p){
  if(personaFacade.existe(p)){
      return false;
  }  else   {
  
   personaFacade.edit(p);
   return true;
  }     
   
   
    
    }
    public List<Persona> personas(){
    return personaFacade.findAll();
    }
    
    public void editar(Persona p){
    personaFacade.edit(p);
    }
    public int contar(){
    return personaFacade.count()+1;
    }
    
   
}

