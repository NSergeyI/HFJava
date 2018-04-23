package ThreadT;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        go();
    }

    public void go() {
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            e.printStackTrace();

        }
        doMore();

    }

    public void doMore() {
        System.out.println("Вершина стека");
    }
}
