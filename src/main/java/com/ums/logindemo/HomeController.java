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
	 *�������жԸ��ķ��ʷ��ص���¼ҳ��
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "login";
	}
	
	/*
	 * ���ض�login·�ɵķ���
	 * */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(String username,String password,Model model) {
		        //��֤���ݹ����Ĳ����Ƿ���ȷ�����򷵻ص���½ҳ�档
				if(username.equals("gameloft9")&&password.equals("123")){
					model.addAttribute("username", username);
					model.addAttribute("password", password);
					return "result";
				}
				return "login";//���ص�¼ҳ��
	}
	
}
