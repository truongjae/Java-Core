public class excute {
    private String s;

    public void excute(callback callback,String m){
        callback.call(m);
        fake(m);
        callback.output();
    }
    public void fake(String m){
        System.out.println("after callback "+m);
    }
}
