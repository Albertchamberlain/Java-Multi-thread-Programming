package chap1;

/**
 * @author Amos
 */
public class MyThread60 extends Thread{
    private  long i = 10;

    @Override
    public void run() {
        while(true)
        {
            i++;
        }
    }
}

class MyThread61 extends Thread
{
    private long i = 0;

    @Override
    public void run() {
        while(true)
        {
            i++;
            System.out.println("i = " + i);
        }
    }
}
class run60
{
    public static void main(String[] args) {
        try
        {
            final MyThread60 myThread60 = new MyThread60();
            myThread60.start();
            Thread.sleep(1000);
            myThread60.suspend();
            System.out.println("main end!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class run61
{
    public static void main(String[] args) {
        try
        {
            final MyThread61 myThread61 = new MyThread61();
            myThread61.start();
            Thread.sleep(1000);
            myThread61.suspend();
            System.out.println("main end!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
