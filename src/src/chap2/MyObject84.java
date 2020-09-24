package chap2;

/**
 * @author Amos
 */
public class MyObject84 {
    public void methodA()
    {
        try
        {
            System.out.println(" = "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread84A extends Thread
{
    private  MyObject84 object;
    public Thread84A (MyObject84 myObject84)
    {
        super();
        this.object = myObject84;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}

class Thread84B extends Thread
{
    private MyObject84 myObject84;
    public Thread84B(MyObject84 myObject84)
    {
        super();
        this.myObject84 = myObject84;
    }

    @Override
    public void run() {
        super.run();
        myObject84.methodA();
    }
}

class Run84
{
    public static void main(String[] args) {
        final MyObject84 myObject84 = new MyObject84();
        final Thread84A thread84A = new Thread84A(myObject84);

        thread84A.setName("a");

        final Thread84B thread84B = new Thread84B(myObject84);
        thread84A.setName("b");

        thread84A.start();
        thread84B.start();
    }
}

class MyObject86
{
    synchronized public void methodA() throws InterruptedException {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
      Thread.sleep(5000);
        System.out.println("end");
    }
}
