package chap2.test2;

/**
 * @author Amos
 */
public class ThreadB extends Thread{

    private MyObject myObject;
    private Service service;

    public ThreadB(MyObject myObject) {
        super();
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.speedPrintString();
    }
}
