package chap1;

/**
 * @author Amos
 */
public class Test1 {
    public static void main(String[] args) {
        try
        {
            Thread.sleep(Integer.MAX_VALUE);
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
