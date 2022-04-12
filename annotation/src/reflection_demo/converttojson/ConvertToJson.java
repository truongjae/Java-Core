package reflection_demo.converttojson;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToJson{
    public static <T> String convert(T t) throws IllegalAccessException {
        if(t.getClass().isAnnotationPresent(Entity.class)){
            Field[] fields = t.getClass().getDeclaredFields();
            List<String> listJson = new ArrayList<>();
            for (Field field : fields){
                field.setAccessible(true);
                Type fieldType = field.getType();
                if(fieldType.equals(String.class)){
                    String json = "\t\"" + field.getName()+"\": \""+ field.get(t)+ "\"";
                    listJson.add(json);
                }
                else if(fieldType.equals(Integer.class)
                        || fieldType.equals(int.class)
                        || fieldType.equals(Float.class)
                        || fieldType.equals(float.class)
                        || fieldType.equals(Long.class)
                        || fieldType.equals(long.class)
                        || fieldType.equals(Boolean.class)
                        || fieldType.equals(boolean.class)){
                    String json = "\t\"" + field.getName()+"\": "+ field.get(t);
                    listJson.add(json);
                }
            }
            String json = "{\n" + listJson.stream().collect(Collectors.joining(",\n"))+ "\n}";

            return json;
        }
        return t.getClass().getSimpleName()+" not entity";
    }
}
