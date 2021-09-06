import java.util.Comparator;

public class LinkedList <T extends Comparable<T>> implements List<T>{
    private Node<T> head;
    private Node<T> tail;
    private int length;
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    @Override
    public int size() {
        return this.length;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
    }

    @Override
    public boolean addHead(T t) {
        Node<T> node = new Node<>(t);
        if(isEmpty()){
            this.head = node;
            this.tail = node;
            this.length++;
            return true;
        }
        node.setNext(this.head);
        this.head = node;
        this.length++;
        return true;
    }

    @Override
    public boolean addTail(T t) {
        Node<T> node = new Node<>(t);
        if(isEmpty()){
            this.head = node;
            this.tail = node;
            this.length++;
            return true;
        }
        this.tail.setNext(node);
        this.tail = node;
        this.length++;
        return true;
    }

    @Override
    public boolean removeHead() {
        if(this.length==0) return false;

        Node<T> node = this.head;
        Node<T> next = this.head.getNext();
        this.head = next;
        node = null;

        return true;
    }

    @Override
    public boolean removeTail() {
        if(this.length==0) return false;
        Node<T> node = this.head;
        while (node.getNext().getNext()!=null){
            node=node.getNext();
        }
        this.tail = node;
        node.setNext(null);
        return true;
    }


    @Override
    public Node<T> find(T data) {
        Node<T> node = this.head;
        while (node!=null){
            if(node.getData().equals(data)){
                return node;
            }
            node = node.getNext();
        }
        return null;
    }
    public void print(){
        Node<T> node = this.head;
        while (node!= null){
            System.out.println(node.getData()+" ");
            node = node.getNext();
        }
    }
}
