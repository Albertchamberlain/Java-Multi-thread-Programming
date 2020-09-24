package chap1;

import java.util.Random;

/**
 * @author Amos
 */
public class MyThread66 extends Thread{
    @Override
    public void run() {
         long l = System.currentTimeMillis();
        long add = 0;
        for (int i = 0; i <10 ; i++) {
            final Random random = new Random();
            random.nextInt();
            add = add +i;
        }
         long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}

class MyThread662 extends Thread
{
    @Override
    public void run() {
        final long l = System.currentTimeMillis();
        long add = 0;
        for (int i = 0; i <10 ; i++) {
            for (int j = 0; j <50000 ; j++) {
                final Random random = new Random();
                random.nextInt();
                add = add+j;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-l);
    }
}


class Run67
{
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
             MyThread66 myThread66 = new MyThread66();
            myThread66.setPriority(10);
            myThread66.start();

            MyThread662 myThread662 = new MyThread662();
            myThread662.setPriority(1);
            myThread662.start();
        }
    }
}

class Run68
{
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
             MyThread66 myThread66 = new MyThread66();
            myThread66.setPriority(10);
            myThread66.start();

             MyThread662 myThread662 = new MyThread662();
            myThread662.setPriority(1);
            myThread662.start();
        }
    }
}