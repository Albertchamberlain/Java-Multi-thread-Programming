package chap1;

/**
 * @author Amos
 */
public class MyThread48 extends Thread {
    @Override
    public void run() {
        super.run();
        try
        {
            for (int i = 0; i <100000 ; i++) {
                System.out.println("(i+1) = " + (i+1));
            }
            System.out.println("chap1.run begin");
            Thread.sleep(200000);
            System.out.println("chap1.run end");
        } catch (InterruptedException e) {
            System.out.println("Stop,then,sleep,in catch!");
            e.printStackTrace();
        }
    }
}

class run48
{
    public static void main(String[] args) {
        final MyThread48 myThread48 = new MyThread48();
        myThread48.start();
        myThread48.interrupt();
        System.out.println("end!");
    }
}
