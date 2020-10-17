package chap2.test7;

public class Run {
    public static void main(String[] args) {
        final Service service = new Service();
        final ThreadA threadA = new ThreadA(service);
        threadA.start();
        final ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
