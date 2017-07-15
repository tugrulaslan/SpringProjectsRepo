package com.tugrulaslan.controller;

import java.util.ArrayList;
import java.util.List;

import com.tugrulaslan.dao.PersonDAO;
import com.tugrulaslan.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {

    @Autowired
	private PersonDAO personDAO;


    @RequestMapping(value = "/ldap", method = RequestMethod.GET)
    public ModelAndView getLdapData() {

        List<Person> getAllPersons = personDAO.getAllPersons();
        ModelAndView model = new ModelAndView("ldapAll");
        model.addObject("listsLDAP", getAllPersons);

        return model;

    }

}