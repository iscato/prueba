/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.google.gson.Gson;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;



/**
 *
 * @author icarques
 */
class AuthService implements AuthInterface {

    @Override
    public Boolean checkAuth(User u) {
        
        Boolean check = false;
        
        return false;
    }
    
}
