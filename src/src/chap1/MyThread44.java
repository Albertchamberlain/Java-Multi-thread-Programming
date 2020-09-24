package chap1;

/**
 * @author Amos
 */
public class MyThread44 extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <50000 ; i++) {
            if(interrupted())
            {
                System.out.println("It has stopped! EXIT!");
                break;
            }
            System.out.println("i = " + (i+1));
        }
        System.out.println("I am print");
    }
}

class run45
{
    public static void main(String[] args) throws InterruptedException {
        try
        {
            final MyThread44 thread = new MyThread44();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
            System.out.println(thread.isAlive());
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("end!!!");

    }
}
