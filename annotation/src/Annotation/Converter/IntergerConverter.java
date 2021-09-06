package Annotation.Converter;

import java.util.Objects;

public class IntergerConverter implements Converter<Integer>{

    @Override
    public Integer converter(Object value) {
        if(Objects.isNull(value)){
            return value.getClass().isPrimitive() ? 0 : null;
        }
        return Integer.parseInt(value.toString());
    }
}
