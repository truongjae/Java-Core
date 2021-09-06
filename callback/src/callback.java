public interface callback {
    void call(String s);
    default void output(){
        System.out.println("day la default ne");
    }
    static callback getInstance(){
        return new callbackimpl();
    }
}
