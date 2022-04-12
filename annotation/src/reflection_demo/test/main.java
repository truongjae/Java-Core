package reflection_demo.test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException {
        User user = new User();
        Bean<User> bean = new Bean<>();
//        bean.inject(user,"truong dep trai");
//        System.out.println(bean.getValue(user));
        Map<String,Class<?>> parameters = new HashMap<>();
        parameters.put("username",String.class);
        parameters.put("password",String.class);

        bean.set(user,parameters,"truong","12345678");
        System.out.println(user);
    }
}
