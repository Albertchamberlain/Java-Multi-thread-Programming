package chap2.String;

import java.net.ServerSocket;

/**
 * @author Amos
 */
public class ThreadB  extends Thread{
    private Service service;

    @Override
    public void run() {
        service.print("AA");
    }

    public ThreadB(Service service)
    {
        super();
        this.service = service;
    }
}
