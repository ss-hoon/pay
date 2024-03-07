package common;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

public @interface WebAdapter {

    @AliasFor(annotation = Component.class)
    String value() default "";
}
