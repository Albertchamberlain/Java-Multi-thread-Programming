package chap2;

/**
 * @author Amos
 */
public class Service92 {
    public void service1()
    {
        System.out.println("service1");
        service2();
    }
    public void service2()
    {
        System.out.println("service2");
        service3();
    }
    public  void service3()
    {
        System.out.println("service3");
    }
}

class  MyThread92 extends Thread
{
    @Override
    public void run()
    {
        final Service92 service92 = new Service92();
        service92.service1();
    }
}


class run92
{
    public static void main(String[] args) {
        final MyThread92 myThread92 = new MyThread92();
        myThread92.start();
    }
}