package com.example.validation.constraints.annotations;

import com.example.validation.constraints.BlacklistValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // 어노테이션을 어디에 적용할 것인지(선택)
@Retention(RetentionPolicy.RUNTIME) // 어노테이션이 언제까지 유지될 것인지
@Constraint(validatedBy = BlacklistValidator.class)
public @interface Blacklist {
    // Annotation Element
    String message() default "username in blacklist";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    // 추가 Element 작성
    String[] blacklist() default {};
}
