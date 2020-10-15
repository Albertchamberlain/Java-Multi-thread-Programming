package chap2.test6;

/**
 * @author Amos
 */
public class ThreadB extends Thread{
    private Service service;

    @Override
    public void run() {
        service.printB();
    }

    public ThreadB(Service service)
    {
        super();
        this.service  = service;
    }
}
