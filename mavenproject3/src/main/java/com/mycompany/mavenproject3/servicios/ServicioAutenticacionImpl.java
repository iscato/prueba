/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.servicios;

import com.mycompany.mavenproject3.dao.FactoriaPersonaDao;
import com.mycompany.mavenproject3.modelo.Persona;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static org.apache.commons.lang.RandomStringUtils.random;

/**
 *
 * @author dpalomar
 */
class ServicioAutenticacionImpl implements ServicioAutenticacion {

    @Override
    public Boolean autenticar(Persona persona) {
        Objects.requireNonNull(persona);
        Objects.requireNonNull(persona.getId());
        Objects.requireNonNull(persona.getNombre());
        List<Persona> personas = FactoriaPersonaDao.get().todos();
        Stream<Persona> filtrado = personas.stream().filter(
                p -> p.getId().equals(persona.getId())
                && p.getNombre().equals(persona.getNombre())
        );
        return filtrado.count() > 0;
    }

    public ServicioAutenticacionImpl() {
        Arrays.asList(random(16, true, true), random(16, true, true))
                .stream().map(s -> new Persona(System.nanoTime(),s))
                .forEach(persona -> FactoriaPersonaDao.get().nueva(persona));
        FactoriaPersonaDao.get().nueva(new Persona(123L,"abc"));
    }

}
