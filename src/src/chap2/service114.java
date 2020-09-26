package chap2;

/**
 * @author Amos
 */
public class service114 {
    private String usernameparam;
    private String passwordparam;
    private String anyString = new String();
    public void setPasswordparam(String password,String username) {
        try
        {
            synchronized (anyString)
            {
                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
                usernameparam = username;
                Thread.sleep(3000);
                passwordparam = password;
                System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread114A extends Thread
{
    private service114 service114;
    public Thread114A(service114 service114)
    {
        super();
        this.service114 =service114;
    }

    @Override
    public void run() {
        service114.setPasswordparam("a","aa");
    }
}

class Thread114B extends Thread
{
    private service114 service114;
    public Thread114B(service114 service114)
    {
        super();
        this.service114 =service114;
    }

    @Override
    public void run() {
        service114.setPasswordparam("b","bb");
    }
}

class Run115
{
    public static void main(String[] args) {
        final service114 service114 = new service114();
        final Thread114A thread114A = new Thread114A(service114);
        thread114A.setName("a");
        thread114A.start();

        final Thread114B thread114B = new Thread114B(service114);

        thread114B.setName("b");
        thread114B.start();
    }
}
//不和其他的this同步方法争抢this锁