package chap2;

/**
 * @author Amos
 */
public class Main93 {
    public int i =10;
    synchronized  void operateI()
    {
        try
        {
            i--;
            System.out.println("i = " + i);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class sub extends Main93
{
    synchronized  public void operateSubI()
    {
        try
        {
            while(i>0)
            {
                i--;
                System.out.println("i = " + i);
                Thread.sleep(100);
                super.operateI();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class  MyThread93 extends Thread
{
    @Override
    public void run() {
        final sub sub = new sub();
        sub.operateSubI();
    }
}

class run93
{
    public static void main(String[] args) {
        final MyThread92 myThread92 = new MyThread92();
        myThread92.start();
    }
}