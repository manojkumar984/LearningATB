package ex_collection_framework_list.QUEUE;

import java.util.PriorityQueue;

public class Lab01_QUEUE {
    public static void main(String[] args) {

        // queue = 0.0001% used in the automation
        // FIFO first come first out

        PriorityQueue q = new PriorityQueue<>();
        q.add("manoj");
        q.add("kumar");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
    }
}
