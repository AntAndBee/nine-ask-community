package com.world.wen.annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.world.wen.annotation.processor.DateTimeFormatProcessor;



/**
 * 
 * 提供对日期时间格式字段的校验注释(默认格式:yyyy-MM-dd，且不允许为空)
 * 
 * @author SM
 * @since 1.0
 */
@Target({ METHOD, FIELD, ANNOTATION_TYPE })
@Retention(RUNTIME)
@Constraint(validatedBy = DateTimeFormatProcessor.class)
public @interface DateTimeFormat {
	String pattern() default "yyyy-MM-dd";

	String message() default "日期格式不正确";

	boolean allowBlank() default false;

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
