/**
 * @author Amos
 */
public class Mythread41 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("(i+1) = " + (i+1));
        }
    }
}
class run41
{
    public static void main(String[] args) throws InterruptedException {

        final Mythread41 mythread41 = new Mythread41();
        mythread41.start();
        Thread.sleep(1000);
        mythread41.interrupt();
        System.out.println("mythread41 = " + mythread41.isInterrupted());

    }
}
