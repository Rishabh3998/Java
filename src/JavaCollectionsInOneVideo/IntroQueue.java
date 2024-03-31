package JavaCollectionsInOneVideo;

import java.util.LinkedList;
import java.util.Queue;

public class IntroQueue {
    public static void queue () {
        // FIFO
        // Here Queue is an interface and can be created via ArrayList, LinkedList, PriorityQueue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(12); // for throwing exception use add() else you will receive boolean if something not added
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        System.out.println(queue);
        int polled = !queue.isEmpty() ? queue.poll() : 0; // for throwing exception use remove() else you will receive boolean
        System.out.println(polled);
        System.out.println(queue);
        System.out.println(queue.peek()); // for throwing exception use element() else you will receive boolean
    }
}
