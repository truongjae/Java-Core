import java.util.HashMap;
import java.util.Map;

public abstract class BasePeople<T> implements People<T>{
    public static Map<String,BasePeople> map = new HashMap<>();
    static {
        map.put(Constain.Employee,new BaseEmloyee());
        map.put(Constain.Student,new BaseStudent());
    }
    public static BasePeople getInstance(String key){
        return map.get(key);
    }
}
