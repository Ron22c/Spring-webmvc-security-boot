package com.cranajit.lc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidatorConstraint implements ConstraintValidator<AgeValidator, Integer>{

	private int lower;
	private int upper;
	
	@Override
	public void initialize(AgeValidator constraintAnnotation) {
		lower = constraintAnnotation.lower();
		upper = constraintAnnotation.upper();
	}
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if(value<lower || value>upper) return false;
		return true;
	}

	
}
