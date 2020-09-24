package chap1;

/**
 * @author Amos
 */
public class Run30 {
    public static void main(String[] args) {
        Count30 count30 = new Count30();
        final Thread thread = new Thread(count30);
        System.out.println("thread.isAlive() = " + thread.isAlive());
        thread.setName("a");
        thread.start();
        System.out.println("thread.isAlive() = " + thread.isAlive());
    }
}
