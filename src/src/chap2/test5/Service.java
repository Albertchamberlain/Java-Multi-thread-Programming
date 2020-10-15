package chap2.test5;

/**
 * @author Amos
 */
public class Service {
    synchronized public static void printA()
    {
        try{
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    synchronized public static void printB()
    {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("Sys = " + System.currentTimeMillis());

        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread() = " + Thread.currentThread());
    }
}
