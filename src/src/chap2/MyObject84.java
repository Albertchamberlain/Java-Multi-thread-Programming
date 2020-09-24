package chap2;

/**
 * @author Amos
 */
public class MyObject84 {
    public void methodA()
    {
        try
        {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            Thread.sleep(50000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class Thread84 extends Thread{
    private MyObject84 object84;
    public Thread84(MyObject84 object84)
    {
        super();
        this.object84 =object84;
    }
}