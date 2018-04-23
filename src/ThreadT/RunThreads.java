package ThreadT;

public class RunThreads implements Runnable {
    public static void main(String[] args) {
        RunThreads runThreads = new RunThreads();
        Thread alpha = new Thread(runThreads);
        Thread beta = new Thread(runThreads);
        alpha.setName("поток альфа---------");
        beta.setName("поток бета");
        alpha.start();
        beta.start();
    }
    @Override
    public void run() {
        for (int i=0;i<500;i++){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" " +i);

        }
    }
}
