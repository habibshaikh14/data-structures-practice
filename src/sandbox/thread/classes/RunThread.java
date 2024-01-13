package sandbox.thread.classes;

import java.util.Date;

import static java.lang.System.out;

public class RunThread extends Thread {
    @Override
    public void run() {
        for (var i = 1; i < 4; i++) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
            out.println(Thread.currentThread().getName() + " Time: " + new Date().getTime());
        }
    }
}
