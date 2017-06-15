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
public interface UserDao {
    User nueva(final User p);
    List<User> todos();
}
