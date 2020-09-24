/**
 * @author Amos
 */
public class Test33 {
    public static void main(String[] args) throws InterruptedException {
        final long l = System.currentTimeMillis();
        Thread.currentThread().sleep(2000,999999);
        final long l1 = System.currentTimeMillis();

        System.out.println(l1-l);
    }
}
