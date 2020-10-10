package chap2.test4;

/**
 * @author Amos
 */
public class ThreadA extends Thread{
    private Service2 serivce2;
    @Override
    public void run() {
        super.run();
    }

    public ThreadA() {
    }

    public ThreadA(Service2 serivce2) {
        this.serivce2 = serivce2;
    }
}
