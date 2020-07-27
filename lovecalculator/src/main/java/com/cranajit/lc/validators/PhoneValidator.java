package com.cranajit.lc.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
@Constraint(validatedBy = PhoneValidatorConstraint.class)
public @interface PhoneValidator {
	int value() default 10;
	String message() default "phone number should be of 10 digits";
	
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
}
