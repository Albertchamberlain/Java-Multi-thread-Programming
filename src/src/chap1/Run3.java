package chap1;

import java.util.Calendar;

/**
 * @author Amos
 */
public class Run3 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <5 ; i++) {
            new Thread(){
                @Override
                public void run() {
                    try{
                        Thread.sleep(200000);
                    }catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                };
            }.start();
        }
    }
}
