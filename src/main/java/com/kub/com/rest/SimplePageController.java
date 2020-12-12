package com.kub.com.rest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author edgar
 */
@Controller
@Scope("request")
public class SimplePageController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String simplePage(Model model) {
        model.addAttribute("name", "Edgar");
        return "simplepage";
    }

}
