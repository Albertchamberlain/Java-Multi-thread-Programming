package chap2;


import java.text.SimpleDateFormat;

class MyTest{

}
/**
 * @author Amos
 */
public class Test129 {
    public static void main(String[] args) {
        final MyTest myTest = new MyTest();
        final MyTest myTest1 = new MyTest();
        final MyTest myTest2 = new MyTest();
        final MyTest myTest3 = new MyTest();

        System.out.println(myTest.getClass()==myTest.getClass());
        System.out.println(myTest.getClass()==myTest1.getClass());
        System.out.println(myTest.getClass()==myTest2.getClass());
        System.out.println(myTest.getClass()==myTest3.getClass());

        System.out.println();

        final SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("");
        final SimpleDateFormat simpleDateFormat2= new SimpleDateFormat("");
        final SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("");
        final SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("");

        System.out.println(simpleDateFormat1.getClass() == simpleDateFormat1.getClass());
        System.out.println(simpleDateFormat1.getClass() == simpleDateFormat2.getClass());
        System.out.println(simpleDateFormat1.getClass() == simpleDateFormat3.getClass());
        System.out.println(simpleDateFormat1.getClass() == simpleDateFormat4.getClass());

    }
}
