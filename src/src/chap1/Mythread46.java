package chap1;

/**
 * @author Amos
 */
public class Mythread46 extends  Thread{
    @Override
    public void run() {
        super.run();
        try
        {
            for (int i = 0; i <500000 ; i++) {
                if (interrupted())
                {
                    System.out.println("It has stopped EXIT");
                    throw new InterruptedException();
                }
                System.out.println("(i+1) = " + (i+1));
            }
            System.out.println("I am under the \"for\" ");
        } catch (InterruptedException e) {
            System.out.println("I am in catch");
            e.printStackTrace();
        }
    }
}
class  run46
{
    public static void main(String[] args) {
        try
        {
            final Mythread46 mythread46 = new Mythread46();
            mythread46.start();
            Thread.sleep(2000);
            mythread46.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("END!");
    }
}