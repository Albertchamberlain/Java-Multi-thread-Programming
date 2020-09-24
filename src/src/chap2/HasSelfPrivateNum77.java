package chap2;

/**
 * @author Amos
 */
public class HasSelfPrivateNum77 {
    private int num = 0;
    public void  addI(String username)
    {
        try
        {
            if("a".equals(username))
            {
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }
            else{
                num=200;
                System.out.println(" b set over");
            }
            System.out.println("username = " + username);
            System.out.println("num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class  ThreadA77 extends Thread
{
    private  HasSelfPrivateNum77 numRef;
    public ThreadA77(HasSelfPrivateNum77 numRef)
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

class  ThreadB77 extends Thread
{
    private HasSelfPrivateNum77 numRef;
    public ThreadB77(HasSelfPrivateNum77 numRef)
    {
        super();
        this.numRef=numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}

class Run78
{
    public static void main(String[] args) {
        final HasSelfPrivateNum77 hasSelfPrivateNum77 = new HasSelfPrivateNum77();
        final ThreadA77 threadA77 = new ThreadA77(hasSelfPrivateNum77);
        threadA77.start();

        final ThreadB77 threadB77 = new ThreadB77(hasSelfPrivateNum77);
        threadB77.start();

    }
}

class HasSelfPrivateNum79
{
    private int num =0;
    synchronized public void addI(String username)
    {
        try
        {
            if ("a".equals(username))
            {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            }
            else
            {
                num =200;
                System.out.println("b set over");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}