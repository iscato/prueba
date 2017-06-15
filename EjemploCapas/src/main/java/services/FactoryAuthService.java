/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author icarques
 */
public abstract class FactoryAuthService {
    private static final AuthInterface DAO = new AuthService();
    public static AuthInterface get(){
        return DAO;
    }
}
