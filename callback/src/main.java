import java.security.spec.RSAOtherPrimeInfo;

public class main {
    public static void main(String[] args) {
       /* excute excute = new excute();
        excute.excute(callback.getInstance(),"abc");*/
        DemoFunctionalInterface demo = (s,a)-> {
            System.out.println("day la "+s);
            System.out.println("tuoi "+a);
        };
        demo.print("truong",20);
        int tong = tinhToan(20,10,(a,b)->tinhTong(a,b));
        int hieu = tinhToan(10,12,main::tinhHieu);
        System.out.println(tong);
        System.out.println(hieu);
    }
    public static int tinhToan(int a, int b, Expression expression){
        return expression.expression(a,b);
    }
    public static int tinhTong(int a,int b){
        return  a+b;
    }
    public static int tinhHieu(int a, int b){
        return a-b;
    }
}
