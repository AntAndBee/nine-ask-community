package com.world.wen.annotation.processor;

import java.text.SimpleDateFormat;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.world.wen.annotation.DateTimeFormat;


/**
 * 校验日期元素的长度符合要求(DateTimeFormat注解处理器)
 * 
 * @author SM
 * @version 1.0
 * 
 */
public class DateTimeFormatProcessor implements ConstraintValidator<DateTimeFormat, String> {

	private String pattern;
	private Boolean allowBlank;

	@Override
	public void initialize(DateTimeFormat constraintAnnotation) {
		pattern = constraintAnnotation.pattern();
		allowBlank = constraintAnnotation.allowBlank();
	}

	@Override
	public boolean isValid(String element, ConstraintValidatorContext context) {
		if (StringUtils.isEmpty(element)) {
			if (allowBlank)
				return true;
			else
				return false;
		} else {
			try {
				final SimpleDateFormat sdf = new SimpleDateFormat();
				sdf.applyPattern(pattern);
				sdf.parse(element);
				return true;
			} catch (Exception e) {
				return false;
			}
		}

	}

}
