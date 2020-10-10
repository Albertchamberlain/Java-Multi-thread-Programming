package chap2.test4;

/**
 * @author Amos
 */
public class Run {
    public static void main(String[] args) {
        final ThreadA threadA = new ThreadA();
        threadA.setName("a");
        threadA.start();

        final ThreadB threadB = new ThreadB();
        threadB.setName("b");
        threadB.start();
    }
}
