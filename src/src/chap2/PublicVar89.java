package chap2;

/**
 * @author Amos
 */
public class PublicVar89 {
    public String username = "A";
    public String password = "AA";

     synchronized  public void setValue(String username,String password)
    {
        try
        {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println(Thread.currentThread().getName());
            System.out.println("username = " + username);
            System.out.println("password = " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void getValue()
    {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }

    synchronized  public void getValue2()
    {
        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
}


class ThreadA89 extends Thread
{
    private PublicVar89 publicVar89;
    public ThreadA89(PublicVar89 publicVar89)
    {
        super();
        this.publicVar89 = publicVar89;
    }

    @Override
    public void run() {
        super.run();
        publicVar89.setValue("B","BB");
    }
}

class Test89
{
    public static void main(String[] args) {
        try
        {
            final PublicVar89 publicVar89 = new PublicVar89();
            final ThreadA89 threadA89 = new ThreadA89(publicVar89);
            threadA89.start();
            Thread.sleep(200);

            publicVar89.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace(); //脏读
        }
    }
}