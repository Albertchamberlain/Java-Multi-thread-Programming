package chap1;

/**
 * @author Amos
 */
public class MyObject62 {
    private String username = "1";
    private String password = "11";
    public void setValue(String u,String p)
    {
        this.username = u;
        if("a".equals(Thread.currentThread().getName()))
        {
            System.out.println("Stop call a");
            Thread.currentThread().suspend();
        }
        this.password  = p;
    }
    public void printUsernamePassword()
    {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
}
class Run62
{
    public static void main(String[] args) throws InterruptedException {
        final MyObject62 myObject62 = new MyObject62();
        final Thread thread = new Thread() {
            @Override
            public void run() {
                myObject62.setValue("a", "aa");
            }
        };
        thread.setName("a");
        thread.start();

        Thread.sleep(500);

        final Thread thread1 = new Thread() {
            @Override
            public void run() {
                myObject62.printUsernamePassword();
            }
        };
        thread1.start();
    }
}