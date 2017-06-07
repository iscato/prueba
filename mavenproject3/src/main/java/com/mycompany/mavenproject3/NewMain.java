/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3;

import com.mycompany.mavenproject3.modelo.Persona;
import com.mycompany.mavenproject3.servicios.FactoriaServicioAutenticacion;
import com.mycompany.mavenproject3.servicios.ServicioAutenticacion;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author icarques
 */
public class NewMain {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioAutenticacion servicio = FactoriaServicioAutenticacion.get();        
        System.out.println(
                servicio.autenticar(new Persona(2L,"Alejandro"))
                ? "Autenticado" : "No autenticado"
        );
        System.out.println(
                servicio.autenticar(new Persona(3L,"Catalin"))
                ? "Autenticado" : "No autenticado"
        );
        
        //new NewMain().f();
    }
    
    void f(){
        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream("consultas.properties");
            Properties p = new Properties();
            p.load(is);
            String property = p.getProperty("consulta1");
            System.out.println(property);
        } catch (IOException ex) {
            Logger.getLogger(NewMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
