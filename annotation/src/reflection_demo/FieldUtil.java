package reflection_demo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class FieldUtil {
    private FieldUtil(){}
    public static Object get(Object object, Field field) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String fieldName = field.getName();
        String getMethodName = "get"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
        Method method = object.getClass().getMethod(getMethodName);
        return method.invoke(object);
    }
    public static Object set(Field field, Object object, Object value) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        String fieldName = field.getName();
        String setMethodName = "set"+fieldName.substring(0,1).toUpperCase()+fieldName.substring(1);
        Method method = object.getClass().getMethod(setMethodName);
        return method.invoke(object,value);
    }
}
