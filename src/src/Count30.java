/**
 * @author Amos
 */
public class Count30 extends Thread{
    public void CountOp(){
        System.out.println("CountOP----Begin");
        System.out.println(" " +Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());
        System.out.println("this.getName( = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());
        System.out.println("this.isDaemon() = " + this.isDaemon());
        System.out.println("CountOP----End");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive() = " + Thread.currentThread().isAlive());

        System.out.println("this.getName() = " + this.getName());
        System.out.println("this.isAlive() = " + this.isAlive());

        System.out.println("run---end");
    }
}
