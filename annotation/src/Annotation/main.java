package Annotation;

import Annotation.Converter.Demo1;

import java.lang.module.FindException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) throws NoSuchFieldException {
        //System.out.println(Demo.class.getDeclaredField("name").getDeclaredAnnotation(MyAnnotation.class).value());
        Map<String,Object> map = new HashMap<>();
        map.put("name","truong");
        map.put("age",15);
        map.put("sex",true);
        map.put("demo1", new Demo1("truong","170"));
//        Demo demo = ReflectionUtil.convertToEntity(map,Demo.class);
//        System.out.println(demo);
        /*Demo demo = ReflectionUtil.convertToEntity(map,Demo.class);
        Field [] fields = Demo.class.getDeclaredFields();
        Arrays.stream(fields).forEach(field -> {
            try {
                Object object = FieldUtil.get(demo,field);
                System.out.println(object);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        });*/
        Demo demo = ReflectionUtil.convertToEntity(map,Demo.class);
        System.out.println(demo);
    }
}
