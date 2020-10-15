package chap2.test6;

import javax.security.sasl.SaslServer;

/**
 * @author Amos
 */
public class Service {
    public void printA() {
        synchronized (Service.class) {
            try {
                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

                Thread.sleep(3000);

                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (Service.class) {

            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        }
    }
}
