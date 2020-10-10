package chap2.test4;

/**
 * @author Amos
 */
public class ThreadB extends Thread{
    private  Service2 service2;

    public ThreadB(Service2 service2) {
        this.service2 = service2;
    }

    @Override
    public void run() {
        super.run();
    }
}
