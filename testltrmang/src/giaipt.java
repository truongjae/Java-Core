public class giaipt {
    private float a,b;

    public giaipt(float a, float b) {
        this.a = a;
        this.b = b;
    }
    public void tinhtoan(){
        if(this.a==0){
            if(this.b==0) System.out.println("phuong trinh vo so nghiem");
            else System.out.println("phuong trinh vo nghiem");
        }
        else System.out.println("phuong trinh co nghiem la "+(-b)/a);
    }
}
