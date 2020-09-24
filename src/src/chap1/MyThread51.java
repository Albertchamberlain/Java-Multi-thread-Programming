package chap1;

/**
 * @author Amos
 */
public class MyThread51 extends Thread{
    @Override
    public void run() {
        try
        {
            this.stop();
        }catch (ThreadDeath e)
        {
            System.out.println(" In the catch method" );
            e.printStackTrace();
        }
    }
}
class run51
{
    public static void main(String[] args) {
        final MyThread51 myThread51 = new MyThread51();
        myThread51.start();
    }
}
