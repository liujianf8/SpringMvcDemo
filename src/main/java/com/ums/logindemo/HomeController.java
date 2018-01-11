package com.ums.logindemo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 *拦截所有对根的访问返回到登录页面
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "login";
	}
	
	/*
	 * 拦截对login路由的访问
	 * */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(String username,String password,Model model) {
		        //验证传递过来的参数是否正确，否则返回到登陆页面。
				if(username.equals("gameloft9")&&password.equals("123")){
					model.addAttribute("username", username);
					model.addAttribute("password", password);
					return "result";
				}
				return "login";//返回登录页面
	}
	
}
