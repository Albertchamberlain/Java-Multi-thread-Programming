package chap2.String;

/**
 * @author Amos
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        final ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();

        final ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
    }
}
