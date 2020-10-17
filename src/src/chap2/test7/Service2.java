package chap2.test7;

public class Service2 {
    Object object = new Object();
    public void methodA()
    {
        synchronized (object)
        {
            System.out.println("methodA  begin");
            boolean isContinueRun  = true;
            while(isContinueRun)
            {

            }
            System.out.println("methodA end");
        }
    }
    Object object1 = new Object();

    public  void methodB()
    {
        synchronized (object1)
        {
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }


}
