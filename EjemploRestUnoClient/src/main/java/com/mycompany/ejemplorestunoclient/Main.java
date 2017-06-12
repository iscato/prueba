/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplorestunoclient;

import com.mycompany.ejemplorestunoclient.client.NewJerseyClient;
import com.mycompany.ejemplorestunocliente.modelo.Persona;

/**
 *
 * @author icarques
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String... args) {
        NewJerseyClient cliente = new NewJerseyClient();
        cliente.putXml(new Persona(1L,"abc"));
        Persona persona = cliente.getXml(Persona.class);
        System.out.println(persona);
        persona = cliente.getById(Persona.class, "1217");
        System.out.println(persona);
        System.out.println("Fin");
    }

}
