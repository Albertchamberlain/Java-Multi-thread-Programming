package chap1;

/**
 * @author Amos
 */
public class MyThread56 extends Thread{
    @Override
    public void run() {
        try
        {
            if(this.interrupted())
            {
                throw new InterruptedException();
            }
            if (this.interrupted())
            {
                throw new InterruptedException();
            }
            if (this.interrupted())
            {
                throw new InterruptedException();
            }
            if (this.interrupted())
            {
                throw new InterruptedException();
            }
            System.out.println("for for for for");
        } catch (InterruptedException e) {
            System.out.println("Write in log info");
            e.printStackTrace();
        }
    }
}
