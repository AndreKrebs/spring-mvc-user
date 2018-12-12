package br.com.andre.springmvcuser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.andre.springmvcuser.service.UserService;

@Controller
public class HelloController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView listUsers(@RequestParam(name="username",required=false) String username, 
			@RequestParam(name="name",required=false) String name,
			@RequestParam(name="email",required=false) String email) {
		
	    ModelAndView map = new ModelAndView("users");
	    map.addObject("userList", 
	    		userService.findUsers(username, name, email));

	    return map;
	}

}
