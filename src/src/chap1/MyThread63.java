package chap1;

/**
 * @author Amos
 */
public class MyThread63 extends Thread {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i <5000000 ; i++) {
            Thread.yield();
            count = count+(i+1);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }
}

class Run63
{
    public static void main(String[] args) {
        final MyThread63 myThread63 = new MyThread63();
        myThread63.start();
    }
}
