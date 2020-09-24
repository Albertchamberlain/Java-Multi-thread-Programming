package chap1;

/**
 * @author Amos
 */
public class Thread18 extends Thread{
    private int count  = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("this.currentThread().getName()+count = " + currentThread().getName()+count);
    }
}

class run18{
    public static void main(String[] args) {
         Thread18 thread18 = new Thread18();
         Thread a = new Thread(thread18, "a");
         Thread b = new Thread(thread18, "b");
         Thread c = new Thread(thread18, "c");
         Thread d = new Thread(thread18, "d");
         Thread e = new Thread(thread18, "e");
        a.start();
        b.start();
        c.start();
        e.start();
        d.start();
        e.run();
    }
}
