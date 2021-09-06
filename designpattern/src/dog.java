public class dog extends animal implements run,fly{


    @Override
    public void fly() {
        System.out.println("khong biet bay");
    }

    @Override
    public void run() {
        System.out.println("chay bang bon chan");
    }
}
