import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int n=12345;
        int donvi = n%10;
        n/=10;
        int hangchuc = n%10;
        n/=10;
        int hangtram = n%10;
        n/=10;
        int hangnghin = n%10;
        n/=10;
        int max = donvi;
        if(max<hangchuc) max = hangchuc;
        if(max<hangtram) max = hangtram;
        if(max<hangnghin) max = hangnghin;
        if(max<n) max = n;
        int s = donvi+hangchuc+hangtram+hangnghin+n;
        System.out.println("tong = "+s);
        System.out.println("max = "+max);
    }
}
