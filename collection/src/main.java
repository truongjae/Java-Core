public class main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        list.addTail(1);
        list.addTail(2);
        list.addTail(3);

        list.print();
        System.out.println(list.find(2));
    }
}
