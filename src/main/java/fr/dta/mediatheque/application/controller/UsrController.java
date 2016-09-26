package fr.dta.mediatheque.application.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.dta.mediatheque.application.model.Usr;
import fr.dta.mediatheque.application.service.UsrService;


@Controller
public class UsrController {

	@Autowired private UsrService usrService;
	
	public static final String CURRENT_USER = "CURRENT_USER";

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String validation(@RequestParam("login") String login, @RequestParam("password") String password,HttpServletRequest request) {
		Usr usr = usrService.findUsrByLogin(login);
		System.out.println(usr);
		if (usr == null)
			return "redirect:pages/login.jsp";

		request.getSession().setAttribute(CURRENT_USER, usr);
		return "redirect:pages/home.jsp";
	}
	

}
