/**
 * @author Amos
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}

class Run{
    public static void main(String[] args) {
        final MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("Over!");
    }
}


class Run2
{
    public static void main(String[] args) throws InterruptedException {
        final MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(200);
        System.out.println("Over!");
    }
}
