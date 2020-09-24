package chap1;

/**
 * @author Amos
 */
public class MyThread54 extends Thread{
    @Override
    public void run() {
        while(true)
        {
            if (this.isInterrupted())
            {
                System.out.println("it stop");
                return;
            }
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        }
    }
}

class Run55
{
    public static void main(String[] args) throws InterruptedException {
        final MyThread54 myThread54 = new MyThread54();
        myThread54.start();
        Thread.sleep(2000);
        myThread54.interrupt();
    }
}
