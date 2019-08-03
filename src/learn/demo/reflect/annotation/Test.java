package learn.demo.reflect.annotation;

import java.lang.annotation.Repeatable;

@Repeatable(Tests.class)
public @interface Test {
	String value() default "empty";
}
