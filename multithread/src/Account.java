import java.time.temporal.Temporal;

public class Account {
    private int balance = 1000;
    public synchronized void minus(int amount){
        System.out.println("rut "+amount);
        while (balance<amount){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        balance-=amount;
        System.out.println("so tien trong tai khoan la "+balance);
    }
    public synchronized void plus(int amount){
        System.out.println("hien tai: "+balance);
        balance+=amount;
        System.out.println("sau khi nap: "+balance);
        notify();
    }

    public static void main(String[] args) {
        Account account = new Account();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                account.minus(1500);
            }
        });
        thread.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                account.plus(200);
            }
        }).start();
        account.plus(2000);

    }
}
