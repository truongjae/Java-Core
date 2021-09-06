public class main {
    public static void main(String[] args) {
        person p = new person();
        if(p instanceof worker){
            ((worker)p).luong();
        }else {
            System.out.println("khong phai worker");
        }
        person p2 =new worker();
        if(p2 instanceof worker){
            ((worker)p2).luong();
        }else {
            System.out.println("khong phai worker");
        }
    }
}
