package chap1;

/**
 * @author Amos
 */
public class MyThread47 extends Thread{
    @Override
    public void run() {
        super.run();
        try
        {
            System.out.println("chap1.Run Begin");
            Thread.sleep(2000000);
            System.out.println("chap1.Run End");
        } catch (InterruptedException e) {
            System.out.println("In sleeping In catch!"+this.isInterrupted());
            e.printStackTrace();
        }
    }
}

class Run47
{
    public static void main(String[] args) throws InterruptedException {
        try
        {
            final MyThread47 myThread47 = new MyThread47();
            myThread47.start();
            Thread.sleep(200);
        }catch (InterruptedException e)
        {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
