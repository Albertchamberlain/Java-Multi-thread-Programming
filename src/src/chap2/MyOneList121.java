package chap2;

import java.util.ArrayList;
import java.util.List;

public class MyOneList121 {
    private List list = new ArrayList();
    synchronized public void add(String data)
    {
        list.add(data);
    };

    synchronized public int getSize()
    {
        return list.size();
    }
}


class MyService121
{
    public MyOneList121 addServiceMethod(MyOneList121 list ,String data)
    {
        try
        {

            if(list.getSize()<1)
            {
                Thread.sleep(2000);
                list.add(data);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}


class MyService1212
{
    public MyOneList121 addServiceMethod(MyOneList121 list ,String data)
    {
        try
        {
            synchronized (list)
            {
                if(list.getSize()<1)
                {
                    Thread.sleep(2000);
                    list.add(data);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return list;
    }
}


class MyOneListThread121 extends Thread
{
    private MyOneList121 list121;
    public  MyOneListThread121(MyOneList121 list1211)
    {
        super();
        this.list121 = list1211;
    }

    @Override
    public void run() {
        MyService121 myService121 = new MyService121();
        myService121.addServiceMethod(list121,"A");
    }

}

class MyOneListThread121B extends Thread
{
    private MyOneList121 list121;
    public  MyOneListThread121B(MyOneList121 list1211)
    {
        super();
        this.list121 = list1211;
    }

    @Override
    public void run() {
        MyService121 myService121 = new MyService121();
        myService121.addServiceMethod(list121,"B");
    }

}


class Run122
{
    public static void main(String[] args) throws InterruptedException {
        final MyOneList121 myOneList121 = new MyOneList121();

        final MyOneListThread121 myOneListThread121 = new MyOneListThread121(myOneList121);

        myOneListThread121.setName("a");
        myOneListThread121.start();


        final MyOneListThread121B myOneListThread121B = new MyOneListThread121B(myOneList121);

        myOneListThread121B.setName("b");
        myOneListThread121B.start();

        Thread.sleep(6000);

        System.out.println("listSize= " + myOneList121.getSize());
    }
}
