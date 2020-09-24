package chap1;

/**
 * @author Amos
 */
public class ThreadA extends Thread {
    private int count =0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while (true)
        {
            count++;
        }
    }
}

class ThreadB extends Thread
{
    private  int count = 0;

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        while(true)
        {
            count++;
        }
    }
}


class Run71
{
    public static void main(String[] args) {
        try
        {
            final ThreadA threadA = new ThreadA();
            threadA.setPriority(Thread.NORM_PRIORITY-3);
            threadA.start();

            final ThreadB threadB = new ThreadB();
            threadB.setPriority(Thread.NORM_PRIORITY+3);
            threadB.start();

            Thread.sleep(20000);
            threadA.stop();
            threadB.stop();
            System.out.println("threadB.getCount() = " + threadB.getCount());
            System.out.println("threadA.getCount() = " + threadA.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}