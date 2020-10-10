package chap2.test2;

/**
 * @author Amos
 */
public class MyObject {
    synchronized public  void speedPrintString()
    {
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

        System.out.println("============");

        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
    }

}
