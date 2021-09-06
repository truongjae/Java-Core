package Annotation.Converter;

import java.util.Objects;
import java.util.logging.Logger;

public class LongConverter implements Converter<Long> {
    @Override
    public Long converter(Object value) {
        if(Objects.isNull(value))
            return Object.class.isPrimitive() ? 0l : null;
        return Long.parseLong(value.toString());
    }
}
