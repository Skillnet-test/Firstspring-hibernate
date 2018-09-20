package com.gontuseries.studentadmissioncontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby,String> {

	@Override
	public void initialize(IsValidHobby isvalidHobby) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		// TODO Auto-generated method stub
		
		if(studentHobby==null){
			return false;
		}else if(studentHobby.matches("Music|Football|Cricket|Hocky")){
			return true;
		}else{
			return false;
		}
		
		
	}

}
