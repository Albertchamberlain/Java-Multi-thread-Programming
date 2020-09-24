package chap1;

/**
 * @author Amos
 */
public class MyThread72 extends Thread{
    private int i = 0;

    @Override
    public void run() {
        try
        {
            while (true)
            {
                i++;
                System.out.println("(i) = " + (i));
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Run72
{
    public static void main(String[] args) {
        try{
            final MyThread72 myThread72 = new MyThread72();
            myThread72.setDaemon(true);
            myThread72.start();
            Thread.sleep(5000);
            System.out.println("I am left the thread ,stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Run73
{
    public static void main(String[] args) {
        final MyThread72 myThread72 = new MyThread72();
        //myThread72.chap1.run();
        myThread72.start();
        myThread72.setDaemon(true);
    }
}