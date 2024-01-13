package sandbox.thread.classes;

import static java.lang.System.out;

public class WorkerThread implements Runnable {
    private final String message;

    public WorkerThread(String s) {
        this.message = s;
    }

    public void run() {
        out.println(Thread.currentThread().getName() + " (Start) message = " + message);
        processMessage();// call processMessage method that sleeps the thread for 2 seconds
        out.println(Thread.currentThread().getName() + " (End)");// prints thread name
    }

    private void processMessage() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}