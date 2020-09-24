/**
 * @author Amos
 */
public class test38 {
    public static void main(String[] args) {
        final Thread thread = Thread.currentThread();
        System.out.println("thread.getName() = " + thread.getName());
        System.out.println("thread.getId() = " + thread.getId());
    }
}
