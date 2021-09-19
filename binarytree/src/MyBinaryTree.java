public class MyBinaryTree {
    public void init(){
        BinaryTree n1 = new BinaryTree(1);
        BinaryTree n2 = new BinaryTree(2);
        BinaryTree n3 = new BinaryTree(3);
        BinaryTree n4 = new BinaryTree(4);
        BinaryTree n5 = new BinaryTree(5);
        BinaryTree n6 = new BinaryTree(6);

        n1.left=n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;

        System.out.println(n1);
    }
}
