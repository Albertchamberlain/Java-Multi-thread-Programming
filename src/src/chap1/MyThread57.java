package chap1;

/**
 * @author Amos
 */
public class MyThread57 extends Thread{
    private  long i =10;
    public long getI()
    {
        return i;
    }
    public void setI(long i)
    {
        this.i = i;
    }

    @Override
    public void run() {
        while(true)
        {
            i++;
        }
    }
}

class Run57
{
    public static void main(String[] args) {
        try
        {
            final MyThread57 myThread57 = new MyThread57();
            myThread57.start();
            Thread.sleep(50000);
            myThread57.suspend();
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            System.out.println(myThread57.getI());

            Thread.sleep(5000);
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            System.out.println("myThread57.getI() = " + myThread57.getI());
            myThread57.resume();
            Thread.sleep(5000);
            System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            System.out.println("myThread57.getI() = " + myThread57.getI());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
