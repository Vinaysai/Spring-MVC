package com.springmvc.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {
		String message = "Hello this is Vinaysai.........";
		return new ModelAndView("hello", "message", message);
	}
}
