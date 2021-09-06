package Annotation.Converter;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class DataConverter {
    private final Map<Type,Converter<?>> converters;

    public DataConverter(){
        this.converters = defaultConverter();
    }

    private Map<Type, Converter<?>> defaultConverter() {
        Map<Type,Converter<?>> map = new HashMap<>();
        map.put(Boolean.class,new BooleanConverter());
        map.put(Integer.class,new IntergerConverter());
        map.put(Boolean.class,new BooleanConverter());
        map.put(String.class,new StringConverter());

        return map;
    }
    public Converter<?> getValue(Type type){
        return converters.get(type);
    }
}
