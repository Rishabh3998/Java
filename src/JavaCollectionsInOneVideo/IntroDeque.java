package JavaCollectionsInOneVideo;

import java.util.ArrayDeque;

public class IntroDeque {
    // It is a doubly ended queue
    // We can add element front and rear both same with remove.

    public static void arrayDeque () {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(126);  // work like normal queue coming from queue as well
        adq.offerFirst(121); // add at head
        adq.offerLast(123); // add at rear
        adq.offer(125); // add at end like queue 
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

        // We can implement stack as well using Deque
    }
}
