package chap1;

/**
 * @author Amos
 */
public class MyService {
    private String username = "a";
    private String password = "aa";

    synchronized public String getUsername() {
        return username;
    }

    synchronized  public String getPassword() {
        return password;
    }

    synchronized public void printString (String username,String password)
    {
        try
        {
            this.username = username;
            Thread.sleep(100000000);
            this.password = password;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyThreadA extends Thread
{
    private MyService obj;
    public MyThreadA(MyService obj)
    {
        super();
        this.obj = obj;
    }
    @Override
    public void run() {
        obj.printString("b","bb");
    }
}

class MythreadB extends Thread
{
    private MyService obj;
    public MythreadB(MyService obj)
    {
        super();
        this.obj = obj;
    }

    @Override
    public void run() {
        super.run();
        System.out.println("obj.getUsername()" + obj.getUsername());
        System.out.println("obj.getPassword() = " + obj.getPassword());
    }
}

class run53
{
    public static void main(String[] args) {
        try
        {
            final MyService myService = new MyService();
            final MyThreadA myThreadA = new MyThreadA(myService);
            myThreadA.start();
            Thread.sleep(100);
            final MythreadB mythreadB = new MythreadB(myService);
            mythreadB.start();
            Thread.sleep(3000);
            myThreadA.stop();
            System.out.println("stop() print username password.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
