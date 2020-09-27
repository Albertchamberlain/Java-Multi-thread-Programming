package chap2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Amos
 */
public class MyList119 {
    private List list = new ArrayList();
    synchronized public void add(String username)
    {
        System.out.println("In" + Thread.currentThread().getName());
        list.add(username);
        System.out.println("Out" + Thread.currentThread().getName());
    }
    synchronized public int getSize()
    {
        System.out.println("In getsize" + Thread.currentThread().getName());
        final int size = list.size();
        System.out.println("Out getsize" + Thread.currentThread().getName());
        return size;
    }
}

class Thread119A extends Thread
{
    private MyList119 myList119;
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <100000 ; i++) {
            myList119.add("threadA"+(i+1));
        }
    }

    public Thread119A(MyList119 myList119)
    {
        super();
        this.myList119 = myList119;

    }
}


class Thread119B extends Thread
{
    private MyList119 myList119;
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <100000 ; i++) {
            myList119.add("threadB"+(i+1));
        }
    }

    public Thread119B(MyList119 myList119)
    {
        super();
        this.myList119 = myList119;

    }
}


class Run120
{
    public static void main(String[] args) {
        final MyList119 myList119 = new MyList119();
        final Thread119A thread119A = new Thread119A(myList119);
        thread119A.setName("a");
        thread119A.start();

        final Thread119B thread119B = new Thread119B(myList119);
        thread119B.setName("b");
        thread119B.start();
    }
}