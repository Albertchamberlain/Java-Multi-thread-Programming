package chap2.test7;

public class Service {
    synchronized public void methdA()
    {
        System.out.println("methodA begin");
        boolean isContinueRun = true;
        while(isContinueRun)
        {

        }
        System.out.println("methodA end");
    }
    synchronized  public  void methedB()
    {
        System.out.println("methdB begin");
        System.out.println("methdB end");
    }
}
