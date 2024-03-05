package org.customannotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@Target({ElementType.METHOD,ElementType.TYPE,ElementType.FIELD})
public @interface Sagar {
    String value() default  "default value";

    int count() default 1;
}
