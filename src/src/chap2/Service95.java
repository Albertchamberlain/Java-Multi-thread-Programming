package chap2;

/**
 * @author Amos
 */
public class Service95 {
    synchronized public void testMethod()
    {
        if("a".equals(Thread.currentThread().getName()))
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println(System.currentTimeMillis());
            int i=1;
            while(i==1)
            {
                if((""+Math.random()).substring(0,8).equals("0.123456"))
                {
                    System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
                    System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
                    Integer.parseInt("a");
                }
            }
        }else
        {
            System.out.println(System.currentTimeMillis());
        }

    }
}
class Thread95A extends Thread
{
    private  Service95 service95;
    public Thread95A (Service95 service95)
    {
        super();
        this.service95 = service95;
    }

    @Override
    public void run() {
        service95.testMethod();
    }
}


class Thread95B extends Thread
{
    private Service95 service95;

    @Override
    public void run() {
        service95.testMethod();
    }
    public Thread95B (Service95 service95)
    {
        super();
        this.service95 = service95;
    }
}

class Test95
{
    public static void main(String[] args) {
        try
        {
            final Service95 service95 = new Service95();
            final Thread95A thread95A = new Thread95A(service95);

            thread95A.setName("a");
            thread95A.start();
            Thread.sleep(500);

            final Thread95B thread95B = new Thread95B(service95);
            thread95B.setName("b");
            thread95B.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}