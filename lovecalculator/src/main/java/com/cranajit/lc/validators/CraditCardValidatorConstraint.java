package com.cranajit.lc.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.cranajit.lc.dtos.CraditCard;


public class CraditCardValidatorConstraint implements ConstraintValidator<CraditCardValidator, CraditCard>{

	@Override
	public boolean isValid(CraditCard value, ConstraintValidatorContext context) {
		return false;
	}
	
}
