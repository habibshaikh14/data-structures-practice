package sandbox.practice.collections;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;

import static java.lang.System.out;

public class PracticeQueues {
    public static void main(String[] args) {
        priorityQueues();
        arrayDequeues();
    }

    private static void arrayDequeues() {
        out.println("\n\nWorking with Array double ended queues");
        var dequeue = new ArrayDeque<String>();
        dequeue.add("Middle");
        dequeue.addFirst("StartMiddle");
        dequeue.addFirst("Start");
        dequeue.addLast("MiddleEnd");
        dequeue.addLast("End");
        out.println(dequeue);
        out.println(dequeue.remove());
        out.println(dequeue.poll());
        out.println(dequeue.remove("MiddleEnd"));
        out.println(dequeue);
    }

    private static void priorityQueues() {
        out.println("Working with priority queues");
        var priorities = new PriorityQueue<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
        out.println(priorities);
        out.println(priorities.peek());
        out.println(priorities.poll());
        out.println(priorities.add("Six"));
        out.println(priorities.element());
        out.println(priorities);
    }
}
