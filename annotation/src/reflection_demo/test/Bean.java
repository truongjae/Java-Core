package reflection_demo.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;

public class Bean<T>{
    public T inject(T t, Object object) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        for(Field field : fields){
            if(field.isAnnotationPresent(Scan.class)){
                field.setAccessible(true);
                field.set(t,object);
            }
        }
        return t;
    }
    public String getValue(T t) throws IllegalAccessException {
        Field[] fields = t.getClass().getDeclaredFields();
        String value = "";
        for(Field field : fields){
            if(field.isAnnotationPresent(Scan.class)){
                field.setAccessible(true);
                value += field.get(t);
            }
        }
        return value;
    }
    public Object get(T t, String attribute) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Field field = t.getClass().getDeclaredField(attribute);
        String fieldName = field.getName();
        String getMethodName = "get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
        Method method = t.getClass().getDeclaredMethod(getMethodName);
        return method.invoke(t);
    }
    public void set(T t,Map<String,Class<?>> parameters, Object... values) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?>[] listClass = new Class[parameters.keySet().size()];
        String getMethodName = "set";
        int i = 0;
        for(String key : parameters.keySet()){
            Field field = t.getClass().getDeclaredField(key);
            String fieldName = field.getName();
            getMethodName+=fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
            listClass[i++] = parameters.get(key);
        }
        System.out.println(getMethodName);
        Method method = t.getClass().getDeclaredMethod(getMethodName,listClass);
        System.out.println(method.getName());
        method.setAccessible(true);
        method.invoke(t,values);
    }
}
