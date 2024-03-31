package JavaCollectionsInOneVideo;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class IntroPriorityQueue {
    public static void priorityQueue () {
        Queue<Integer> pq = new PriorityQueue<>();
        // By-default priority here is set in favor of ascending order
        // If we use remove the smallest element will be remove first.

        // under the hood a min heap is working here.

        pq.offer(12); // for throwing exception use add() else you will receive boolean if something not added
        pq.offer(13);
        pq.offer(14);
        pq.offer(15);
        System.out.println(pq);
        int polled = !pq.isEmpty() ? pq.poll() : 0; // for throwing exception use remove() else you will receive boolean
        System.out.println(polled);
        System.out.println(pq);
        System.out.println(pq.peek()); // for throwing exception use element() else you will receive boolean

        // To change the nature of the priority queue from returning smallest ele to return largest element.
        // Where under the hood a max heap will be working. We can pass a comparator in constructor

        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); // converted to max heap
    }
}
