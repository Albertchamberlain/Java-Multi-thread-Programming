package chap1;

/**
 * @author Amos
 */
public class CountOp extends Thread{
    public CountOp()
    {
        System.out.println("chap1.CountOp---begin");
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("this = " + this.getName());
        System.out.println("chap1.CountOp---end");
    }

    @Override
    public void run() {
        System.out.println("chap1.run---begin");
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("this = " + this.getName());
        System.out.println("chap1.run---end");
    }
}

class run28{
    public static void main(String[] args) {
        CountOp c = new CountOp();
        final Thread thread = new Thread(c);
        thread.setName("a");
        thread.start();
    }
}
