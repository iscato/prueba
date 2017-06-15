/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.List;
import model.User;

/**
 *
 * @author icarques
 */
public interface FactoryUserDao {
    static final UserDao DAO = new BdEnArchivo();
    public static UserDao get(){
        return DAO;
    }
}
