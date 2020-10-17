package chap2.test8;

public class deadLockTT implements  Runnable{
    public  String username;

    public Object object  = new Object();
    public Object object1=  new Object();

    public void setFlag( String username)
    {
        this.username = username;
    }
    @Override
    public void run() {
        if("a".equals(username))
        {
            synchronized (object)
            {
                try {
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (object1)
                {
                    System.out.println("cling object->object2");
                }
            }
        }
        if("b".equals(username))
        {
            synchronized (object1)
            {
                try{
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object)
                {
                    System.out.println("cling object->object1");
                }
            }
        }
    }
}
