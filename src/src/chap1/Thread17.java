package chap1;

/**
 * @author Amos
 */
public class Thread17 extends Thread{
    private int count = 5;

    public Thread17(String name)
    {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while(count>0)
        {
            count--;
            System.out.println("this.currentThread().getName()+count = " + currentThread().getName()+count);

        }
    }
}
class run{
    public static void main(String[] args) {
        Thread17 a= new Thread17("a");
        Thread17 b= new Thread17("b");
        Thread17 c= new Thread17("c");
        a.start();
        b.start();
        c.start();
    }
}
