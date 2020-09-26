package chap2;

/**
 * @author Amos
 */
public class Main96 {
    public void serviceMethod()
    {
        try
        {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Sub97 extends Main96
{
    @Override
    public void serviceMethod() {
        try
        {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            super.serviceMethod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class MyThreadA97 extends Thread
{
    private Sub97 sub97;

    @Override
    public void run() {
        sub97.serviceMethod();
    }

    public MyThreadA97(Sub97 sub97)
    {
        super();
        this.sub97 = sub97;
    }
}

class MyThreadB97 extends Thread
{
    private Sub97 sub97;

    @Override
    public void run() {
        sub97.serviceMethod();
    }

    public MyThreadB97(Sub97 sub97)
    {
        super();
        this.sub97 = sub97;
    }
}

class Test98
{
    public static void main(String[] args) {
        final Sub97 sub97 = new Sub97();
        final MyThreadA97 myThreadA97 = new MyThreadA97(sub97);
        myThreadA97.setName("a");
        myThreadA97.start();
        final MyThreadB97 myThreadB97 = new MyThreadB97(sub97);
        myThreadB97.setName("b");
        myThreadB97.start();
    }
}