package Annotation.Converter;

import java.util.Objects;

public class StringConverter implements Converter<String>{

    @Override
    public String converter(Object value) {
        return Objects.isNull(value) ? null : value.toString();
    }
}
