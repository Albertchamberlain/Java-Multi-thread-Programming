package chap1;

/**
 * @author Amos
 */
public class MyThread24 extends Thread{
    private int i=5;

    @Override
    public void run() {
        System.out.println("(i--)+Thread.currentThread().getName() = " + (i--)+Thread.currentThread().getName());
    }
}

class run34{
    public static void main(String[] args) {
        final MyThread24 myThread24 = new MyThread24();
        final Thread thread1 = new Thread(myThread24);
        final Thread thread2 = new Thread(myThread24);
        final Thread thread3 = new Thread(myThread24);
        final Thread thread4 = new Thread(myThread24);
        final Thread thread5 = new Thread(myThread24);

        thread1.start();
        thread2.start();
        thread3.start();
        thread5.start();
        thread4.start();
    }
}
