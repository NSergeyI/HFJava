package ThreadT;

public class TestSync implements Runnable {
    private int balance;

    @Override
    public void run() {
    for (int i=0;i<500000;i++){
        increment();
        System.out.println("Balance equal: "+balance);
    }
    }

    private synchronized void increment() {
        int i = balance;
        balance = i+1;
    }
}
