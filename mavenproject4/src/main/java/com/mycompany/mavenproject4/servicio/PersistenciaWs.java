/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4.servicio;

import com.mycompany.mavenproject4.modelo.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author icarques
 */
@WebService(serviceName = "PersistenciaWs")
@Stateless
public class PersistenciaWs {

    @PersistenceContext(unitName = "com.mycompany_mavenproject4_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    public Persona crear(String nombre) {
        Persona p = new Persona(nombre);
        em.persist(p);
        return p;
    }
    
    public List<Persona> todos() {
        return null;
    }
}
