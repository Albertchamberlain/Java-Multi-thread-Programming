/**
 * @author Amos
 */
public class tt39  extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i <500000 ; i++) {
            System.out.println("(i+1) = " + (i+1));
        }
    }
}

class run39
{
    public static void main(String[] args) throws InterruptedException {
        final tt39 tt39 = new tt39();
        tt39.start();
        Thread.sleep(2000);
        tt39.interrupt();
        System.out.println("zzzzzzzzzzzzzzz");
    }
}
