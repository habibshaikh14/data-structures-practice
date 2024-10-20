package leetcode;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Dummy {
  public static void main(String[] args) {
    ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
    Runnable worker1 = () -> System.out.println("I am worker 1 :: " + System.currentTimeMillis());
    Runnable worker2 = () -> System.out.println("I am worker 2 :: " + System.currentTimeMillis());
    Runnable worker3 = () -> System.out.println("I am worker 3 :: " + System.currentTimeMillis());
    Runnable lastWorker = executorService::shutdown;
    executorService.scheduleAtFixedRate(worker1, 1, 1, TimeUnit.SECONDS);
    executorService.scheduleAtFixedRate(worker2, 2, 2, TimeUnit.SECONDS);
    executorService.scheduleAtFixedRate(worker3, 3, 3, TimeUnit.SECONDS);
    executorService.schedule(lastWorker, 10, TimeUnit.SECONDS);
  }
}
