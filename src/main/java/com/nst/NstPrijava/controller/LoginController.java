/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nst.NstPrijava.controller;

import com.nst.NstPrijava.domen.User;
import com.nst.NstPrijava.service.UserService;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ivan
 */
@Controller
public class LoginController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/")
    public ModelAndView start() {
        return new ModelAndView("login.jsp");
    }

    @RequestMapping(value = "/action/login", method = RequestMethod.POST)
    public ModelAndView login(HttpServletRequest request, String username, String password) {
        User u = userService.login(username, password);
        if (u != null) {
            request.getSession().setAttribute("ulogovan_korisnik", u);
            return new ModelAndView("/WEB-INF/welcome.jsp");
        }
        return new ModelAndView("/login.jsp");
    }

    @RequestMapping(value = "/action/logout", method = RequestMethod.GET)
    public ModelAndView logut(HttpServletRequest request) {
        request.getSession().removeAttribute("ulogovan_korisnik");
        return new ModelAndView("/login.jsp");
    }
}
