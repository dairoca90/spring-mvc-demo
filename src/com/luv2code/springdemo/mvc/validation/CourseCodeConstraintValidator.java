package com.luv2code.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;
	
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		
		
		boolean result;
		if(theCode!=null) {
			result = theCode.startsWith(coursePrefix);
		}else {
			result = true;
		}
				
		// TODO Auto-generated method stub
		return result;
	}

}
