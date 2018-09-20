package com.gontuseries.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloControllerPathVariable {
	
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloPage(@PathVariable Map<String,String> pathVars) {
		// TODO Auto-generated method stub
		// alternatively we can use map here. @PathVariable Map<String,String> pathVars
		// instead of @PathVariable("userName") String name,@PathVariable("countryName") String countryName
		String name=pathVars.get("userName");
		String countryName=pathVars.get("countryName");
		
		ModelAndView modelAndView=new ModelAndView("HiYou"); 
		modelAndView.addObject("msg", "hello "+name+" country:-"+countryName);
		return modelAndView;
	}
	
	

}
