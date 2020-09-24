package chap1;

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

class run42
{
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("Thread.interrupted() = " + Thread.interrupted());
        System.out.println("Thread.interrupted() = " + Thread.interrupted());//状态清除
    }
}

class run43
{
    public static void main(String[] args) {
        try
        {
            final Mythread41 mythread41 = new Mythread41();
            mythread41.start();;
            Thread.sleep(1000);
            mythread41.interrupt();
            System.out.println("mythread41.isInterrupted() = " + mythread41.isInterrupted());
            System.out.println("mythread41.isInterrupted() = " + mythread41.isInterrupted());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("END!!!!");
    }
}
