package com.ums.logindemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "login";
	}
	
	@RequestMapping(value = "login", method = {RequestMethod.POST,RequestMethod.GET})
	public String login(String username,String password,Model model) {
				if(username.equals("gameloft9")&&password.equals("123")){
					model.addAttribute("username", username);
					model.addAttribute("password", password);
					return "result";
				}
				return "login";
	}
	
}
