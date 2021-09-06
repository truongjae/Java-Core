import java.util.Scanner;

public class Person {
    private String name;
    private String lop;

    public void nhap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        this.name = scanner.nextLine();
        System.out.println("Nhap lop: ");
        this.lop = scanner.nextLine();
    }

    public void xuat(){
        System.out.println(this.name + " " + this.lop);
    }
}
