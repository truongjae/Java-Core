package reflection_demo;

import java.lang.reflect.Field;

public class main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        User user = new User();
        Field field = User.class.getDeclaredField("username");
        field.setAccessible(true);
        field.set(user,"hello");
        System.out.println(user.getUsername());
    }
}
