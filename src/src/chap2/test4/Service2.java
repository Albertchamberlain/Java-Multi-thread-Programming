package chap2.test4;

/**
 * @author Amos
 */
public class Service2 {
    synchronized public static void printA()
    {
        try
        {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized  public void printB()
    {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

    }

    synchronized public void printC()
    {
        System.out.println("System.currentTimeMillis().get = " + Thread.currentThread().getName());
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

    }
}
