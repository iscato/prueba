/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import model.User;

/**
 *
 * @author icarques
 */
public interface AuthInterface {
    Boolean checkAuth(User u);
}
