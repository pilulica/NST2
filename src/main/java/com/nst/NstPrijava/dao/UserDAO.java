/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst.NstPrijava.dao;

import com.nst.NstPrijava.domen.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ivan
 */
@Repository
public interface UserDAO extends JpaRepository<User, String>{
    
    @Query("SELECT u FROM User u WHERE username = ?1 AND password = ?2")
    User login(String username, String password);
    
}
