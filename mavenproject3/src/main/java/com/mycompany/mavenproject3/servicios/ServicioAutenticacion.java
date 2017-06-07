/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.servicios;

import com.mycompany.mavenproject3.modelo.Persona;

/**
 *
 * @author dpalomar
 */
public interface ServicioAutenticacion {
    Boolean autenticar(final Persona persona);
}
