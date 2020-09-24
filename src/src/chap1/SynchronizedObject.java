package chap1;

/**
 * @author Amos
 */
public class SynchronizedObject {
    synchronized public void printString()
    {
        System.out.println("begin");
        if ("a".equals(Thread.currentThread().getName()))
        {
            System.out.println("a suspend");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}

class run59
{
    public static void main(String[] args) {
        try
        {
            final SynchronizedObject object = new SynchronizedObject();
            Thread thread = new Thread()
            {
                @Override
                public void run() {
                    object.printString();
                }
            };
            thread.setName("a");
            thread.start();

            Thread.sleep(1000);

            Thread thread1 = new Thread()
            {
                @Override
                public void run() {
                    System.out.println("thread2 go on ,printString");
                    System.out.println("Because lock and suspend");
                }

            };
            thread1.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
