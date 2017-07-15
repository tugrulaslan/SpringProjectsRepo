package com.tugrulaslan.controller;

import com.tugrulaslan.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tugrul on 19.02.2014.
 */
@Controller
public class MainController {

    private List<User> allUserList = new ArrayList<User>();

    @RequestMapping(value = "/user-form")
    public ModelAndView personPage(){
        return new ModelAndView("user-page", "userCommand", new User());
    }

    @RequestMapping(value = "/addUser")
    public ModelAndView processPerson(@ModelAttribute User user){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-result-page");
        modelAndView.addObject("user", user);
        allUserList.add(user);
        return modelAndView;
    }

    @RequestMapping(value = "/listUsers")
    public ModelAndView listAllPerson(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user-list");
        modelAndView.addObject("users",allUserList);

        return modelAndView;
    }
}
