public class bird extends animal implements run,fly{
    @Override
    public void fly() {
        System.out.println("biet bay");
    }

    @Override
    public void run() {
        System.out.println("khong biet chay");
    }
}
