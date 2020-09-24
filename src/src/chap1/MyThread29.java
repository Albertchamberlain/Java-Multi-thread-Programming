package chap1;

/**
 * @author Amos
 */
public class MyThread29 extends Thread{
    @Override
    public void run() {
        System.out.println("this.isAlive() = " + this.isAlive());
    }
}

class run29
{
    public static void main(String[] args) throws InterruptedException {
        final MyThread29 myThread29 = new MyThread29();
        System.out.println("myThread29 = " + myThread29.isAlive());
        myThread29.start();
        Thread.sleep(10000);
        System.out.println("myThread29 = " + myThread29.isAlive());
    }
}
