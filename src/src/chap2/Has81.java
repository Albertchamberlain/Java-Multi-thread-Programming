package chap2;

/**
 * @author Amos
 */
public class Has81 {
    private  int num =0;
    synchronized public void addI(String usernum)
    {
        try
        {
            if ("a".equals(usernum))
            {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000
                );
            }
            else
            {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println("usernum = " + usernum);
            System.out.println("num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class  Thread82 extends Thread
{
    private Has81 numRef;

    public Thread82(Has81 has81)
    {
        super();
        this.numRef = has81;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("a");
    }
}

class  Thread832 extends Thread
{
    private Has81 numRef;
    public Thread832(Has81 numRef)
    {
        super();
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.addI("b");
    }
}


class Run83
{
    public static void main(String[] args) {
        final Has81 has81 = new Has81();

        final Has81 has811 = new Has81();

        final Thread82 thread82 = new Thread82(has81);
        thread82.start();

        final Thread832 thread832 = new Thread832(has811);
        thread832.start();

    }
}