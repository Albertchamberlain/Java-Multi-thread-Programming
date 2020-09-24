package chap1;

/**
 * @author Amos
 */
public class MyThread65 extends Thread{
    @Override
    public void run() {
        System.out.println("this.getPriority() = " + this.getPriority());
        final MyThread2 myThread2 = new MyThread2();
        myThread2.start();
    }
}

class MyThread2 extends Thread
{
    @Override
    public void run() {
        System.out.println("this.getPriority() = " + this.getPriority());
    }
}
class Run65
{
    public static void main(String[] args) {
        System.out.println("Thread.currentThread().getPriority() = " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("Thread.currentThread().getPriority() = " + Thread.currentThread().getPriority());
        final MyThread65 myThread65 = new MyThread65();
        myThread65.start();
    }
}