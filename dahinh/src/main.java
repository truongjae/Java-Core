public class main {
    public static void main(String[] args) {
        emloyee e = new emloyee();
        person p = new emloyee();
        e.setTen("nguyen gia truong");
        e.thongtin();
        p.thongtin();
        emloyee e2 = (emloyee) new person();
    }
}
