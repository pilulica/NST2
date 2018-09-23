/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst.NstPrijava.service.impl;

import com.nst.NstPrijava.dao.UserDAO;
import com.nst.NstPrijava.domen.User;
import com.nst.NstPrijava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ivan
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;
    
    @Override
    public User login(String username, String password) {
        return userDAO.login(username, password);
    }
    
}
