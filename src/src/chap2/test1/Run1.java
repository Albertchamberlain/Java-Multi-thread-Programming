package chap2.test1;

/**
 * @author Amos
 */
public class Run1 {
    public static void main(String[] args) {
        final Service service = new Service();
        final MyObject myObject = new MyObject();
        final MyObject myObject1 = new MyObject();

        final ThreadA threadA = new ThreadA(service, myObject);
        threadA.setName("a");
        threadA.start();

        final ThreadB threadB = new ThreadB(service, myObject1);
        threadB.setName("b");
        threadB.start();

    }
}
