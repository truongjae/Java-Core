package reflection_demo;

import Annotation.Converter.Converter;
import Annotation.Converter.DataConverter;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReflectionUtil{
    public static <T> T ConvertToEntity(Map<String,Object> map, Class<T> tClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        T t = tClass.getConstructor().newInstance();
        Field fields[] = tClass.getDeclaredFields();
        DataConverter dataConverter = new DataConverter();

        Arrays.stream(fields).forEach(field -> {
            String name = field.getName();
            if(map.containsKey(name)){
                field.setAccessible(true);
                Object object = map.get(name);
                Converter<?> converter = dataConverter.getValue(field.getType());
                try {
                    if (converter == null) {
                        FieldUtil.set(field, t, object);
                    } else {
                        FieldUtil.set(field, t, converter.converter(object));
                    }
                }
                catch(NoSuchMethodException | InvocationTargetException | IllegalAccessException e){
                    e.printStackTrace();
                }
            }
        });
        return t;
    }
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Map<String,Object> map = new HashMap<>();
        map.put("username","truong");
        map.put("password","123");
        User user = ConvertToEntity(map,User.class);
        System.out.println(user.getUsername());
    }
}
