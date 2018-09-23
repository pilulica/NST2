/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst.NstPrijava.service;

import com.nst.NstPrijava.domen.User;

/**
 *
 * @author Ivan
 */

public interface UserService {
    
    User login(String username, String password);
}
