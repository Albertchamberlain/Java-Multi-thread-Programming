package chap1;

/**
 * @author Amos
 */
public class MyThread50 extends Thread{
    private int i = 0;

    @Override
    public void run() {
        try
        {
            while(true)
            {
                i++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class run50
{
    public static void main(String[] args) {
        try
        {
            final MyThread50 myThread50 = new MyThread50();
            myThread50.start();
            Thread.sleep(8000);
            myThread50.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
