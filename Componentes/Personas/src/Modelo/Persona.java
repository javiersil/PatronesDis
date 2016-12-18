/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cosma_000
 */
@Entity
@Table(name = "PERSONA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByIdpresona", query = "SELECT p FROM Persona p WHERE p.idpresona = :idpresona"),
    @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Persona.findByApellidom", query = "SELECT p FROM Persona p WHERE p.apellidom = :apellidom"),
    @NamedQuery(name = "Persona.findByApellidop", query = "SELECT p FROM Persona p WHERE p.apellidop = :apellidop"),
    @NamedQuery(name = "Persona.findByEdad", query = "SELECT p FROM Persona p WHERE p.edad = :edad"),
    @NamedQuery(name = "Persona.findByEstatura", query = "SELECT p FROM Persona p WHERE p.estatura = :estatura"),
    @NamedQuery(name = "Persona.findByPeso", query = "SELECT p FROM Persona p WHERE p.peso = :peso"),
    @NamedQuery(name = "Persona.findBySexo", query = "SELECT p FROM Persona p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Persona.findByEdocivil", query = "SELECT p FROM Persona p WHERE p.edocivil = :edocivil")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDPRESONA")
    private Integer idpresona;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDOM")
    private String apellidom;
    @Column(name = "APELLIDOP")
    private String apellidop;
    @Column(name = "EDAD")
    private Integer edad;
    @Column(name = "ESTATURA")
    private Integer estatura;
    @Column(name = "PESO")
    private Integer peso;
    @Column(name = "SEXO")
    private Character sexo;
    @Column(name = "EDOCIVIL")
    private Character edocivil;

    public Persona() {
    }

    public Persona(Integer idpresona) {
        this.idpresona = idpresona;
    }

    public Integer getIdpresona() {
        return idpresona;
    }

    public void setIdpresona(Integer idpresona) {
        this.idpresona = idpresona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEstatura() {
        return estatura;
    }

    public void setEstatura(Integer estatura) {
        this.estatura = estatura;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getEdocivil() {
        return edocivil;
    }

    public void setEdocivil(Character edocivil) {
        this.edocivil = edocivil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpresona != null ? idpresona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idpresona == null && other.idpresona != null) || (this.idpresona != null && !this.idpresona.equals(other.idpresona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Persona[ idpresona=" + idpresona + " ]";
    }
    
}
