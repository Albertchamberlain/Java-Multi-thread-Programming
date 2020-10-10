package chap2.test4;

/**
 * @author Amos
 */
public class ThreadC extends  Thread{
    private Service2 service;

    public ThreadC(Service2 service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
