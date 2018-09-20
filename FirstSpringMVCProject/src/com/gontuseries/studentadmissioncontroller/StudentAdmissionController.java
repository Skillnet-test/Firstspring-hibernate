package com.gontuseries.studentadmissioncontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		
		//binder.setDisallowedFields(new String[]{"studentMobile"});
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class,"studentDOB",new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class,"studentName",new StudentNameEditor());
	}
	
	@RequestMapping(value="/admissionForm.html",method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
		
	}
	
	/*@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,
			                                @RequestParam("studentHobby") String hobby){
		
		Student student=new Student();
		student.setStudentName(name);
		student.setStudentHobby(hobby);
		
		
		ModelAndView model=new ModelAndView("AdmissionSuccess");
		//model.addObject("msg","details submitted by student:: name:-"+name+" hobby:-"+hobby);
		model.addObject("headerMessage", "gontu college of engineering ,India");
		model.addObject("student1", student);
		return model;
		
	}*/
	
	@ModelAttribute
	public void addingCommonOjects(Model model){
		
		model.addAttribute("headerMessage", "gontu college of engineering ,India");
	}
	
	
	@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student,BindingResult result){
		
		/*Student student=new Student();
		student.setStudentName(name);
		student.setStudentHobby(hobby);
		*/
		
		if(result.hasErrors()){
			
			ModelAndView model=new ModelAndView("AdmissionForm");
			return model;
		}
		
		
		ModelAndView model=new ModelAndView("AdmissionSuccess");
		//model.addObject("headerMessage", "gontu college of engineering ,India");
		//model.addObject("student1", student);
		return model;
		
	}
	/*@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar){
		
		String name=reqPar.get("studentName");
		String hobby=reqPar.get("studentHobby");
		
		ModelAndView model=new ModelAndView("AdmissionSuccess");
		model.addObject("msg","details submitted by student:: name:-"+name+" hobby:-"+hobby);
		return model;
		
	}
*/
}
