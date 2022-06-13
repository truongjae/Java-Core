public class LinkedList {
    private LinkedList next;
    private int data;

    public LinkedList(LinkedList next){
        this.next = next;
    }
    public LinkedList(LinkedList next,int data){
        this.next = next;
        this.data = data;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
