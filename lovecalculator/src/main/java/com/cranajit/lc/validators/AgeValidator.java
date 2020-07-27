package com.cranajit.lc.validators;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgeValidatorConstraint.class)
public @interface AgeValidator {
	int lower() default 18;
	int upper() default 60;
	String message() default "age should be between {lower}-{upper}";
	
	Class<?>[] groups() default { };
	Class<? extends Payload>[] payload() default { };
}
