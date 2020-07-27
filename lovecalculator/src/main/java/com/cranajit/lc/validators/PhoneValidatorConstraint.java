package com.cranajit.lc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.cranajit.lc.dtos.Phone;

public class PhoneValidatorConstraint implements ConstraintValidator<PhoneValidator, Phone>{

	private int value;
	
	@Override
	public void initialize(PhoneValidator constraintAnnotation) {
		value = constraintAnnotation.value();
	}
	
	@Override
	public boolean isValid(Phone phone, ConstraintValidatorContext context) {
		if(phone.getNumber().length() > value || phone.getNumber().length() < value) return false;
		return true;
	}

}
