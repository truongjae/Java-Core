import java.lang.reflect.Field;

public class main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student();
        student.setAddress("bac ninh");
        student.setFullName("nguyen gia truong");
        System.out.println(ReflectionUtil.convertToJson(student));
    }
}
