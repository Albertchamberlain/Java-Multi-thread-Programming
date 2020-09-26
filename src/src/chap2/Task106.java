package chap2;

import chap1.MyThread;

/**
 * @author Amos
 */
public class Task106 {
    public void doLongTimeTask()
    {
        for (int i = 0; i <100 ; i++) {
            System.out.println("Thread.currentThread().getName()+(i+1) = " + Thread.currentThread().getName()+(i+1));
            System.out.println("");
        }
        synchronized (this)
        {
            for (int i = 0; i <100 ; i++) {
                System.out.println("Thread.currentThread().getName()+(i+1) = " + Thread.currentThread().getName()+(i+1));
            }
        }
    }
}


class MyThread106 extends Thread
{
    private Task106 task106;
    @Override
    public void run() {
        super.run();
        task106.doLongTimeTask();
    }

    public MyThread106(Task106 task106)
    {
        this.task106 = task106;
    }
}

class MyThread1062 extends Thread
{
    private Task106 task106;
    @Override
    public void run() {
        super.run();
        task106.doLongTimeTask();
    }

    public  MyThread1062(Task106 task106)
    {
        this.task106 = task106;
    }
}

class Run106
{
    public static void main(String[] args) {
        final Task106 task106 = new Task106();

        final MyThread106 myThread106 = new MyThread106(task106);
        myThread106.start();

        final MyThread1062 myThread1062 = new MyThread1062(task106);

        myThread1062.start();
    }
}