import java.util.HashMap;
import java.util.Map;

public class FactoryBean {
    public static Map<String,Object> bean = new HashMap<>();
    public static <T> T getInstance(Mode mode,String key,Factory<T> ... tClass){
        switch (mode){
            case Animal:
                if(bean.containsKey(key)){
                    return (T) bean.get(key);
                }
                T t = tClass[0].create();
                bean.put(key,t);
                return t;
            case Worker:
                if(bean.containsKey(key)) {
                    return (T) bean.get(key);
                }
                T t1 = tClass[0].create();
                bean.put(key,t1);
                return t1;
            default: return null;
        }
    }
    public enum Mode{
        Animal,Worker;

    }
}
