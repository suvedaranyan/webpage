package com.javabycode.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
    @RequestMapping(value="/greeting" ,method = RequestMethod.GET)
    public String hello(@RequestParam("username") String username,
    @RequestParam("password") String password,Model model)
    {
    	if(username.equals("fresherpro") && password.equals("fresherpro"))
    	{
    		model.addAttribute("name",username);
    		return("hello");
    	}
    	return("index");
    }
}
