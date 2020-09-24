/**
 * @author Amos
 */
public class MyThread31 extends Thread{
    @Override
    public void run() {
        try
        {
            System.out.println("this.currentThread().getName() = " + this.currentThread().getName());
            System.out.println("begin");
            Thread.sleep(2000);
            System.out.println("this.getName() = " + this.getName());
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Run32
{
    public static void main(String[] args) {
        final MyThread31 myThread31 = new MyThread31();
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        myThread31.run();
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
    }
}


class Run33
{
    public static void main(String[] args) {
        final MyThread31 myThread31 = new MyThread31();
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        System.out.println("begin");
        myThread31.start();
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
        System.out.println("end");
    }
}
