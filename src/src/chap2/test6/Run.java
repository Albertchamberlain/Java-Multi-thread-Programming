package chap2.test6;

/**
 * @author Amos
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        final Service service1 = new Service();

        final ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();

        final ThreadB threadB = new ThreadB(service1);
        threadB.start();
    }
}
