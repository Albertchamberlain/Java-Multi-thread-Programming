package chap2;

/**
 * @author Amos
 */
public class ObjectService108 {
    public void serviceMethodA()
    {
        try
        {
            synchronized (this)
            {
                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void serviceMethodB()
    {
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
    }
}


class Thread108 extends Thread
{
    private ObjectService108 objectService108;

    public Thread108(ObjectService108 objectService108)
    {
        super();
        this.objectService108 = objectService108;
    }

    @Override
    public void run() {
        super.run();
        objectService108.serviceMethodA();
    }
}


class Thread1082 extends Thread
{
    private ObjectService108 objectService108;

    public Thread1082(ObjectService108 objectService108)
    {
        super();
        this.objectService108 = objectService108;
    }

    @Override
    public void run() {
        super.run();
        objectService108.serviceMethodB();
    }
}


class Run109
{
    public static void main(String[] args) {
        final ObjectService108 objectService108 = new ObjectService108();
        final Thread108 thread108 = new Thread108(objectService108);
        thread108.setName("a");
        thread108.start();

        final Thread1082 thread1082 = new Thread1082(objectService108);
        thread1082.setName("b");
        thread108.start();
    }
}




