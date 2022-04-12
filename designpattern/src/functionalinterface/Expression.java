package functionalinterface;


import java.util.function.Function;

public interface Expression {
    int sum(int a, int b);
    default void a(){
        System.out.println("a");
    }
    static void b(){
        System.out.println("a");
    }
}
