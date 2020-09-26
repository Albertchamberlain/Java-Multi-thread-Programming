package chap2;

/**
 * @author Amos
 */
public class doLongTimeTask2 {
    private String getData1;
    private String getData2;
    public void doLongTimeTask() {
        try {
            System.out.println("Begin Task");
            Thread.sleep(3000);

            String privateGetData1 = "long time after 1" + Thread.currentThread().getName();
            String privateGetData2 = "long time after 2" + Thread.currentThread().getName();


            synchronized (this) {
                getData1 = privateGetData1;
                getData2 = privateGetData2;
                System.out.println("getData1 = " + getData1);
                System.out.println("getData2 = " + getData2);
                System.out.println("end Task");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
