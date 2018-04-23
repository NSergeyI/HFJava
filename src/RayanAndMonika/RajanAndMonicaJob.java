package RayanAndMonika;

public class RajanAndMonicaJob implements Runnable {
    private BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RajanAndMonicaJob theJob = new RajanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);
        one.setName("Райан");
        two.setName("Моника");
        one.start();
        two.start();
    }
    @Override
    public void run() {
        for (int x=0;x<10;x++){
            makeWithdrawl(10);
            if (account.getBalance()<0){
                System.out.println("Превышение лимита");
            }
        }
    }

    private synchronized void makeWithdrawl(int amount){
        if (account.getBalance()>=amount){
            System.out.println(Thread.currentThread().getName()+" собирается снять деньги");
            try{
                System.out.println(Thread.currentThread().getName()+" идет подремать");
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" просыпается");
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" заканчивает транзакцию");
        } else {
            System.out.println("Извините, для клиента "+Thread.currentThread().getName()+" недостаточно денег");
        }
    }
}
