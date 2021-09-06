import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao a: ");
        float a = sc.nextFloat();
        System.out.println("nhap vao b: ");
        float b = sc.nextFloat();
        giaipt giai = new giaipt(a,b);
        giai.tinhtoan();*/

        /*String s = "3+4";
        tinhtoan tinh = new tinhtoan();
        System.out.println(tinh.tinh(s));*/








        Scanner sc = new Scanner(System.in);
        int [] a = new int [100];
        int n=5;
        for (int i=0;i<n;i++){
           a[i] = sc.nextInt();
        }
        xulimang mang = new xulimang();
        int [] b= mang.insert(a,5,2,6);
        for (int i = 0; i < n+1; i++) {
            System.out.print(b[i]+" ");
        }
        int [] c= mang.delete(a,5,2);
        for (int i = 0; i < n-1; i++) {
            System.out.print(c[i]+" ");
        }
        int [] d = mang.sx(a,n);
        for (int i = 0; i < n; i++) {
            System.out.print(d[i]+" ");
        }
    }
}
