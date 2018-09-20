package com.gontuseries.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
@RequestMapping("/greet")
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloPage() {
		// TODO Auto-generated method stub
		ModelAndView modelAndView=new ModelAndView("HelloPage"); 
		modelAndView.addObject("welcomeMessage", "Hi user,welcome to the first spring MVC applicaiton");
		return modelAndView;
	}
	
	// this is a multi action controller class
	@RequestMapping("/hi")
	public ModelAndView helloPerson(){
		
		ModelAndView modelAndView=new ModelAndView("HiYou"); 
		modelAndView.addObject("msg", "Hi user,welcome to the first spring MVC applicaiton in hi");
		return modelAndView;
		
		
	}

		
	

}
