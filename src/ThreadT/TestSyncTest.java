package ThreadT;

public class TestSyncTest {
    public static void main(String[] args) {
        TestSync testSync = new TestSync();
        Thread a = new Thread(testSync);
        Thread b = new Thread(testSync);
        a.start();
        b.start();
    }
}
