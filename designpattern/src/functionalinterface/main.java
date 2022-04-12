package functionalinterface;

public class main {

    public static int tong(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Expression expression = (a,b)->{
            return tong(a,b);
        };

        System.out.println(expression.sum(6,5));
    }


}
