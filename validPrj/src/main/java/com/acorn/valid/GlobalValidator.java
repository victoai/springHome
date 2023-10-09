package com.acorn.valid;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class GlobalValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
//		return User2.class.equals(clazz); // 검증하려는 객체가 User2타입인지 확인
		return User2.class.isAssignableFrom(clazz); // clazz가 User2 또는 그 자손인지 확인
	}
	

	@Override
	public void validate(Object target, Errors errors) { 
		System.out.println("UserValidator.validate() is called");
		User2 user = (User2)target;		
		String id = user.getId();		
//		if(id==null || "".equals(id.trim())) {
//			errors.rejectValue("id", "required");
//		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id",  "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pw", "required");
		
		if(id==null || id.length() <  5 || id.length() > 12) {		 
			errors.rejectValue("id", "invalidLength", new String[]{"5","12"}, null);
		} 
		 
	}
}
 