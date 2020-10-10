package chap2.test1;

/**
 * @author Amos
 */
public class Service {
    public void testMethod1(MyObject myObject){
        synchronized (myObject)
        {
            try
            {
                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
                Thread.sleep(2000);
                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
