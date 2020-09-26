package chap2;

/**
 * @author Amos
 */
public class ObjectService103 {
    public void serviceMethod()
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
}

class Thread103 extends Thread
{
    private ObjectService103 objectService103;
    public  Thread103(ObjectService103 objectService103)
    {
        super();
        this.objectService103 = objectService103;
    }

    @Override
    public void run() {
        super.run();
        objectService103.serviceMethod();
    }
}

class Thread1032 extends Thread
{
    private ObjectService103 objectService103;
    public  Thread1032(ObjectService103 objectService103)
    {
        super();
        this.objectService103 = objectService103;
    }

    @Override
    public void run() {
        super.run();
        objectService103.serviceMethod();
    }
}


class Run104
{
    public static void main(String[] args) {
        final ObjectService103 objectService103 = new ObjectService103();
        final Thread103 thread103 = new Thread103(objectService103);
        thread103.setName("a");
        thread103.start();

        final Thread1032 thread1032 = new Thread1032(objectService103);

        thread1032.setName("b");
        thread1032.start();
    }
}