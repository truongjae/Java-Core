public class LinkedListUtils {
    public static LinkedList createNode(int data){
        LinkedList linkedList = new LinkedList(null,data);
        return linkedList;
    }
    public static LinkedList addHead(LinkedList linkedList, int data){
        LinkedList node = createNode(data);
        if(linkedList == null){
            linkedList = node;
        }
        else{
            node.setNext(linkedList);
            linkedList = node;
        }
        return linkedList;
    }
    public static LinkedList addEnd(LinkedList linkedList, int data){
        LinkedList node = createNode(data);
        LinkedList p;
        if(linkedList==null){
            linkedList = node;
        }
        else{
            p = linkedList;
            while(p.getNext()!=null){
                p = p.getNext();
            }
            p.setNext(node);
        }
        return linkedList;
    }

    public static void main(String[] args) {
        LinkedList linkedList = createNode(1);
        linkedList = addEnd(linkedList,2);
        linkedList = addEnd(linkedList,3);
        linkedList = addEnd(linkedList,4);
        while(linkedList!=null){
            System.out.println(linkedList.getData());
            linkedList = linkedList.getNext();
        }
    }
}
