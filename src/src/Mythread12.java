/**
 * @author Amos
 */
public class Mythread12 extends Thread{
    private int i;
    public Mythread12(int i)
    {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println("i = " + i);
    }
}
class Test12
{
    public static void main(String[] args) {
        Mythread12 t11 = new Mythread12(1);
        Mythread12 t12 = new Mythread12(2);
        Mythread12 t13 = new Mythread12(3);
        Mythread12 t14 = new Mythread12(4);
        Mythread12 t15 = new Mythread12(5);
        Mythread12 t16 = new Mythread12(6);
        Mythread12 t17 = new Mythread12(7);
        Mythread12 t18 = new Mythread12(8);
        Mythread12 t19 = new Mythread12(9);
        Mythread12 t110 = new Mythread12(10);
        Mythread12 t111= new Mythread12(11);
        Mythread12 t112= new Mythread12(12);
        Mythread12 t113= new Mythread12(13);

        t11.start();
        t12.start();
        t14.start();
        t13.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
        t110.start();
        t111.start();
        t112.start();
        t113.start();
    }
}
