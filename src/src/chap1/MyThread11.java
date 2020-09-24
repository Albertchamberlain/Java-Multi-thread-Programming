package chap1;

/**
 * @author Amos
 */
public class MyThread11 extends Thread{
   @Override
    public void run()
    {
        for (int i = 0; i <10000 ; i++) {
            System.out.println("chap1.run = "+Thread.currentThread().getName());
        }
    }
}

class test11{
    public static void main(String[] args) {
        final MyThread11 myThread11 = new MyThread11();
        myThread11.setName("myThread");
        myThread11.start();

        for (int i = 0; i <10000 ; i++) {
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());
        }
    }
}
