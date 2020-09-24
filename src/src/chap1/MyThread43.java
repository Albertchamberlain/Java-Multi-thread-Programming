package chap1;

/**
 * @author Amos
 */
public class MyThread43  extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <500000 ; i++) {
            if(interrupted())
            {
                System.out.println("It's Stopped EXIT");
                break;
            }
            System.out.println("(i+1) = " + (i+1));
        }
    }
}
class run44
{
    public static void main(String[] args) {
        try{
            final Mythread41 mythread41 = new Mythread41();
            mythread41.start();
            Thread.sleep(2000);
            mythread41.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end !!!");
    }
}
