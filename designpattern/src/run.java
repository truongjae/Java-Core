public interface run {
    void run();
    default void demo(){
        System.out.println("demo");
    }
    static void demo(String demo){
        System.out.println(demo);
    }
}
