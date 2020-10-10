package chap2.test4;

/**
 * @author Amos
 */
public class Run2 {
    public static void main(String[] args) {
        final Service2 service2 = new Service2();
        final ThreadA threadA = new ThreadA(service2);

        threadA.setName("a");
        threadA.start();

        final ThreadB threadB = new ThreadB(service2);
        threadB.setName("b");
        threadB.start();

        final ThreadC threadC = new ThreadC(service2);
        threadC.setName("c");
        threadC.start();
    }
}
