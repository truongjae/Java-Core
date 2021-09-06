package Annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Locale;

public class FieldUtil {
    private FieldUtil(){}
    public static Object get(Object object, Field field) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String fieldName = field.getName();
        String getMethodName = "get"+ fieldName.substring(0,1).toUpperCase()+ fieldName.substring(1);
        Method method = object.getClass().getMethod(getMethodName);
        return method.invoke(object);
    }
    public static void set(Field field, Object object, Object value) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String fieldName = field.getName();
        String getMethodName = "set"+ fieldName.substring(0,1).toUpperCase()+ fieldName.substring(1);
        Method method = object.getClass().getMethod(getMethodName,field.getType());
        method.invoke(object,value);
    }
}
