package chap2.test3;

/**
 * @author Amos
 */
public class MyObject {
    public  void speedPrintString()
    {
        synchronized (this)
        {
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

            System.out.println("==========");

            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        }
    }
}
