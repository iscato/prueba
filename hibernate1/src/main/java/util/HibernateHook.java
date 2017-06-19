/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author icarques
 */
public class HibernateHook extends Thread {
    
    @Override
    public void run() {
        HibernateUtil.getSessionFactory().close();
        System.out.println("Factoría de sesiones cerrada");
    }
}
