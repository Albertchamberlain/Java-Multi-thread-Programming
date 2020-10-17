package chap2.test8;

public class RUn {
    public static void main(String[] args) {
        try{
            final deadLockTT deadLockTT = new deadLockTT();
            deadLockTT.setFlag("a");

            final Thread thread = new Thread(deadLockTT);

            thread.start();

            Thread.sleep(100);

            deadLockTT.setFlag("b");
            final Thread thread1 = new Thread(deadLockTT);
            thread1.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
