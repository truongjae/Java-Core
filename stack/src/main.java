import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
//        Stack<String> strings = new Stack<>();
//        strings.push("hello");
//        strings.push("hehe");
//        strings.push("xin chao");
//        strings.forEach(System.out::print);
//        strings.pop();
//        System.out.println();
//        strings.forEach(System.out::print);

        Queue<String> queue = new LinkedList<>();
        queue.offer("hello");
        queue.offer("hehe");
        queue.offer("xin chao");
        queue.forEach(System.out::println);

        queue.element();
        queue.forEach(System.out::println);
    }
}
