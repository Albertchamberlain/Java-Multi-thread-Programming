package chap2;

/**
 * @author Amos
 */
public class MyObject862 {
    synchronized public void methodA()
    {
        try
        {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println(System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodB()
    {
        try
        {
            System.out.println(Thread.currentThread().getName());
            System.out.println(System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("END");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class Thread86A extends Thread
{
    private MyObject862 object862;
    public  Thread86A(MyObject862 myObject862)
    {
        this.object862 = myObject862;
    }

    @Override
    public void run() {
        super.run();
        object862.methodA();
    }
}
class  Thread86B extends Thread
{
    private MyObject862 object862;

    public Thread86B(MyObject862 Myobject862)
    {
        this.object862 = Myobject862;
    }

    @Override
    public void run() {
        super.run();
        object862.methodB();
    }
}


class Run87
{
    public static void main(String[] args) {
        final MyObject862 myObject862 = new MyObject862();
        final Thread86A thread86A = new Thread86A(myObject862);
        thread86A.setName("a");

        final Thread86B thread86B = new Thread86B(myObject862);
        thread86B.setName("b");
        thread86A.start();
        thread86B.start();
    }
}