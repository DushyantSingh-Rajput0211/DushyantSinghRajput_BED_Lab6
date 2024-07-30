package com.GL.StudentRegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

	@RequestMapping("/")
	public String rootContextPathAccess() {
		return "redirect:/students/list";
	}

}
