import java.util.logging.Logger;

/**
 * @author Amos
 */
public class LoginServlet {
    private static  String usernameRef;
    private  static  String passworfRef;

    synchronized public static  void dopost(String username,String passworf)
    {
        try
        {
            usernameRef = username;
            if ("a".equals(username))
            {
                Thread.sleep(5000);
            }
            passworfRef = passworf;
            System.out.println("usernameRef = " + usernameRef);
            System.out.println("passworfRef = " + passworfRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ALogin extends Thread
{
    @Override
    public void run() {
        LoginServlet.dopost("a","aa");
    }
}

class BLogin extends  Thread
{
    @Override
    public void run() {
        LoginServlet.dopost("b","bb");
    }
}

class run22
{
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        final BLogin bLogin = new BLogin();
        bLogin.start();

        ALogin a2 = new ALogin();
        a2.start();
        final BLogin bLogin2 = new BLogin();
        bLogin2.start();
    }
}

