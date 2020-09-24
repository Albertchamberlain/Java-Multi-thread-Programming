package chap1;

import java.util.Random;

/**
 * @author Amos
 */
public class MyThread68 extends Thread{
    @Override
    public void run() {
        final long l = System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            final Random random = new Random();
            random.nextInt();
        }
        final long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}

class Thread692 extends Thread
{
    @Override
    public void run() {
        final long l = System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            final Random random = new Random();
            random.nextInt();
        }
        final long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}

class Run69
{
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            final MyThread68 myThread68 = new MyThread68();
            myThread68.setPriority(5);
            myThread68.start();


            final Thread692 thread692 = new Thread692();
            myThread68.setPriority(6);
            thread692.start();
        }
    }
}
