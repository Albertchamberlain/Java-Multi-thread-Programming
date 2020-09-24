/**
 * @author Amos
 */
public class test35 {
    public void a()
    {
        b();
    }
    public void b()
    {
        c();
    }
    public  void c()
    {
        d();
    }
    public void d()
    {
        e();
    }
    public void e()
    {
        int age =0;
        age =100;
        if(age == 100)
        {
            Thread.dumpStack();
        }
    }

    public static void main(String[] args) {
        final test35 test35 = new test35();
        test35.a();
    }
}
