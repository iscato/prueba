/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.util.List;

/**
 *
 * @author icarques
 */
public class Aritmetica {
    
    public Double media(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()){
            throw new IllegalArgumentException();
        } else if (numeros.stream().filter(n -> n < 0).count() > 0) {
            throw new RuntimeException();
        }
        
        return numeros.stream().reduce(0.0, (a, b) -> a + b) / numeros.size();
    }
}
