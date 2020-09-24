package chap1;

/**
 * @author Amos
 */
public class MyThread55 extends Thread{
    @Override
    public void run() {
        if(interrupted())
        {
            System.out.println("Write in log info");
            return;
        }

        if(interrupted())
        {
            System.out.println("Write in log info");
            return;
        }
        if(interrupted())
        {
            System.out.println("Write in log info");
            return;
        }
        if(interrupted())
        {
            System.out.println("Write in log info");
            return;
        }
        System.out.println("for for for for for");
    }
}
