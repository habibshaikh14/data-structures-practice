package sandbox;

import sandbox.thread.classes.WorkerThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.lang.System.out;

public class TestThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);// creating a pool of 5 threads
        for (var i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + (i + 1));
            executor.execute(worker);// calling execute method of ExecutorService
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
            out.println("Executor is still running");
        }

        out.println("Finished all threads");
    }
}
