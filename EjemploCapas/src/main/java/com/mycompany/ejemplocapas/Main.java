/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplocapas;

import daos.FactoryUserDao;
import static java.lang.System.out;
import java.util.Arrays;
import model.User;
import static org.apache.commons.lang3.RandomStringUtils.random;

/**
 *
 * @author icarques
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arrays.asList(random(16, true, true), random(16, true, true))
                .stream().map(s -> new User(s))
                .forEach(persona -> FactoryUserDao.get().nueva(persona));
        FactoryUserDao.get().todos().forEach(out::println);
    }
    
}
