package chap2;

/**
 * @author Amos
 */
public class Task110 {
    public void otherMethod()
    {
        System.out.println("================run-otherMethod");
    }

    public void doLongTimeTask()
    {
        synchronized (this)
        {
            for (int i = 0; i <10000; i++) {
                System.out.println("ThreadA.currentThread().getName()+(i+1) = " + ThreadA.currentThread().getName()+(i+1));
            }
        }
    }
}

class MyThread111 extends Thread
{
    private Task110 task110;
    public MyThread111(Task110 task110)
    {
        super();
        this.task110 =task110;
    }

    @Override
    public void run() {
        super.run();
        task110.doLongTimeTask();
    }
}


class MyThread1112 extends Thread
{
    private Task110 task110;
    public MyThread1112(Task110 task110)
    {
        super();
        this.task110 =task110;
    }

    @Override
    public void run() {
        super.run();
        task110.otherMethod();
    }
}
class Run112
{
    public static void main(String[] args) throws InterruptedException {
        Task110 task110 = new Task110();

        final MyThread111 myThread111 = new MyThread111(task110);
        myThread111.start();
        Thread.sleep(100);

        final MyThread111 myThread1111 = new MyThread111(task110);
        myThread111.start();

    }
}

class Task113
{
    synchronized public void otherMethod()
    {
        System.out.println("-------------run-otherMethod");
    }
    public void doLongTimeTask()
    {
        synchronized (this)
        {
            for (int i = 0; i <1000 ; i++) {
                System.out.println("Thread.currentThread().getName()+(i+1) = " + Thread.currentThread().getName()+(i+1));
            }
        }
    }
}