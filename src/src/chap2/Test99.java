package chap2;

import com.sun.xml.internal.ws.assembler.jaxws.TerminalTubeFactory;

/**
 * @author Amos
 */
public class Test99 {
    public static void main(String[] args) {
        System.out.println("Thread.currentThread().holdsLock(Test99.class) = " + Thread.currentThread().holdsLock(Test99.class));

        synchronized (Test99.class)
        {
            System.out.println("Thread.currentThread().holdsLock(Test99.class) = " + Thread.currentThread().holdsLock(Test99.class));

        }
        System.out.println("C" + Thread.currentThread().holdsLock(Test99.class));
    }
}
