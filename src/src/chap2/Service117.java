package chap2;

/**
 * @author Amos
 */
public class Service117 {
    private String anystring = new String();
    public void a()
    {
        try
        {
            synchronized (anystring)
            {
                System.out.println("a begin");
                Thread.sleep(3000);
                System.out.println("a end");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    synchronized public void b()
    {
        System.out.println("b begin");
        System.out.println("b end");
    }
}

class Thread117A extends Thread{
    private Service117 service117;
    public Thread117A(Service117 service117)
    {
        super();
        this.service117 =service117;
    }

    @Override
    public void run() {
        service117.a();
    }
}

class Thread117B extends Thread{
    private Service117 service117;
    public Thread117B(Service117 service117)
    {
        super();
        this.service117 =service117;
    }

    @Override
    public void run() {
        service117.b();
    }
}

class Run118
{
    public static void main(String[] args) {
        final Service117 service117 = new Service117();

        final Thread117A thread117A = new Thread117A(service117);
        thread117A.setName("a");
        thread117A.start();

        final Thread117B thread117B = new Thread117B(service117);

        thread117B.setName("b");
        thread117A.start();
    }
}