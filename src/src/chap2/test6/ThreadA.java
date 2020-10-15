package chap2.test6;

/**
 * @author Amos
 */
public class ThreadA extends Thread{
    private Service service;

    @Override
    public void run() {
        super.run();
        service.printA();
    }


    public ThreadA(Service service)
    {
        super();
        this.service = service;
    }
}
