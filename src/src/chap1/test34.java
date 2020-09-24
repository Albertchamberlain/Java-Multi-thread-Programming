package chap1;

/**
 * @author Amos
 */
public class test34 {
    public void a()
    {
        b();
    }
    public void b()
    {
        c();
    }
    public void c()
    {
        d();
    }
    public  void d()
    {
        e();
    }
    public  void e()
    {
        final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if(stackTrace !=null)
        {
            for (int i = 0; i < stackTrace.length ; i++) {
                StackTraceElement each =stackTrace[i];
                System.out.println("each.getClassName() = " + each.getClassName());
                System.out.println("each.getMethodName() = " + each.getMethodName());
                System.out.println("each.getFileName() = " + each.getFileName());
                System.out.println("each.getLineNumber() = " + each.getLineNumber());
            }
        }
    }

    public static void main(String[] args) {
        test34 tt = new test34();
        tt.a();
    }
}

