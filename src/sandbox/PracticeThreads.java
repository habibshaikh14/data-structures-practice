package sandbox;

import sandbox.thread.classes.RunThread;
import sandbox.thread.classes.StartThread;

public class PracticeThreads {
    public static void main(String[] args) throws InterruptedException {
        var startThread = new StartThread();
        var runThread = new RunThread();
        runThread.setName("RT");
        var t1 = new Thread(startThread);
        var t2 = new Thread(startThread);
        var t3 = new Thread(startThread);
        t1.setName("T1");
        t1.start();
        t1.join();
        t2.setName("T2");
        t2.start();
        t3.setName("T3");
        t3.start();
        runThread.start();
    }
}
