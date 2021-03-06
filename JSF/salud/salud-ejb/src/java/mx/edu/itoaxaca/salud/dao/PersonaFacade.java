/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.itoaxaca.salud.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import mx.edu.itoaxaca.salud.modelo.Persona;

/**
 *
 * @author Friday
 */
@Stateless
public class PersonaFacade extends AbstractFacade<Persona> {

    @PersistenceContext(unitName = "salud-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaFacade() {
        super(Persona.class);
    }
    
    
    public boolean existe(Persona p){
     Query q = getEntityManager().createNamedQuery("Persona.findByNombre");
        q.setParameter("nombre", p.getNombre());
        
        if(q.getResultList().size()>0)
    return true;
        else   return false;
    }
}
