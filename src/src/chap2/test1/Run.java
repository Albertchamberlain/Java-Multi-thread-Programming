package chap2.test1;

/**
 * @author Amos
 */
public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        final MyObject myObject = new MyObject();
        final ThreadA threadA = new ThreadA(service, myObject);
        threadA.setName("a");
        threadA.start();

        final ThreadB threadB = new ThreadB(service, myObject);

        threadB.setName("b");
        threadB.start();
    }
}
