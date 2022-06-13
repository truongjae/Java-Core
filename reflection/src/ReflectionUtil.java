import java.lang.reflect.Field;

public class ReflectionUtil {
    public static <T> String convertToJson(Object object) throws IllegalAccessException {
        StringBuilder stringBuilder = new StringBuilder();
        Field[] fields = object.getClass().getDeclaredFields();
        stringBuilder.append("{\n");
        for (Field field : fields){
            field.setAccessible(true);
            stringBuilder.append("\""+field.getName()+"\":");
            stringBuilder.append("\""+field.get(object)+"\",\n");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
