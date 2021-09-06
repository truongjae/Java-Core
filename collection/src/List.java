import java.util.Comparator;

public interface List <T extends Comparable<T>>{
    int size();
    boolean isEmpty();
    boolean addHead(T t);
    boolean addTail(T t);
    boolean removeHead();
    boolean removeTail();
    Node<T> find(T data);
    void print();
}
