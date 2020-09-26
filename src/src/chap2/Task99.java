package chap2;

/**
 * @author Amos
 */
public class Task99 {
    private String getData1;
    private String getData2;
    public synchronized void doLongTimeTask()
    {
        try
        {
            System.out.println("Begin task");
            Thread.sleep(3000);
            getData1 = "Long time after 1"+Thread.currentThread().getName();
            getData2 = "Long time after 2"+Thread.currentThread().getName();
            System.out.println("getData1 = " + getData1);
            System.out.println("getData2 = " + getData2);
            System.out.println("END Task");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CommonUtils
{
    public static long beginTime1;
    public static long endTime1;
    
    public static long beginTime2;
    public static long endTime2;
    
}


class  Mythread100 extends Thread
{
    private Task99 task99;
    public Mythread100(Task99 task99)
    {
        this.task99 = task99;
    }


    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task99.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}

class  Mythread1002 extends Thread
{
    private Task99 task99;
    public Mythread1002(Task99 task99)
    {
        this.task99 = task99;
    }


    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task99.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}

class Run101
{
    public static void main(String[] args) {
        final Task99 task99 = new Task99();
        final Mythread100 mythread100 = new Mythread100(task99);
        
        mythread100.start();

        final Mythread1002 mythread1002 = new Mythread1002(task99);
        mythread1002.start();
        
        try
        {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long beginTime = CommonUtils.beginTime1;
        if(CommonUtils.beginTime2<CommonUtils.beginTime1)
        {
            beginTime = CommonUtils.beginTime2;
        }
        
        long endTime = CommonUtils.endTime1;
        if(CommonUtils.endTime2>CommonUtils.endTime1)
        {
            endTime = CommonUtils.endTime2;
        }
        System.out.println("(endTime-beginTime)/1000 = " + (endTime-beginTime)/1000);
    }
}


