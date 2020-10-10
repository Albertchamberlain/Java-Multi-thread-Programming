package chap2;

/**
 * @author Amos
 */
public class service116 {
    private String usernameParam;
    private String passwordParam;
    public void setUsernamePassword(String username,String password)
    {
        try
        {
            String anyString = new String();
            synchronized (anyString)
            {
                System.out.println("Thread.currentThread() = " + Thread.currentThread());
                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("Thread.currentThread() = " + Thread.currentThread());
                System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



