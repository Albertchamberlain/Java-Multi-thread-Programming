package chap2;

/**
 * @author Amos
 */
public class HasSelfPrivateNum {
    public void addI(String username)
    {
        try
        {
            int num = 0;
            if("a".equals(username))
            {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }
            else
            {
                num = 200;
                System.out.println("b set over" );
            }
            System.out.println("username = " + username);
            System.out.println("num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadA extends Thread
{
    private HasSelfPrivateNum numRef;
    public ThreadA(HasSelfPrivateNum numRef)
    {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}

class ThreadB extends Thread
{
    private HasSelfPrivateNum numRef;

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
    public ThreadB(HasSelfPrivateNum numRef)
    {
        super();
        this.numRef = numRef;
    }
}
class Run76
{
    public static void main(String[] args) {
        HasSelfPrivateNum numRef = new HasSelfPrivateNum();

        final ThreadA threadA = new ThreadA(numRef);
        threadA.start();

        final ThreadB threadB = new ThreadB(numRef);
        threadB.start();

    }
}