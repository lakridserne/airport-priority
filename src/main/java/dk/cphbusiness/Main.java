package dk.cphbusiness;

import dk.cphbusiness.airport.template.Passenger;
import dk.cphbusiness.algorithm.examples.queues.PriorityQueueUsingHeap;

public class Main {

    public static void main(String[] args) {
       // PriorityQueueUsingHeap<Integer> pq = new PriorityQueueUsingHeap<Integer>();

       // PriorityQueueUsingHeap<Passenger> pq = new PriorityQueueUsingHeap<Passenger>();
        PriorityQueueUsingHeap<Passenger> pq = new PriorityQueueUsingHeap<Passenger>();

        pq.enqueue();
        System.out.println(pq.toString());
        pq.insert(5);
        System.out.println(pq.toString());
        pq.insert(2);
        System.out.println(pq.toString());
        pq.insert(-1);
        System.out.println(pq.toString());
        pq.insert(9);
        System.out.println(pq.toString());
        pq.insert(4);
        System.out.println(pq.toString());

        pq.delMax();
        System.out.println(pq.toString());
        pq.delMax();
        System.out.println(pq.toString());
        pq.delMax();
        System.out.println(pq.toString());
        pq.delMax();
        System.out.println(pq.toString());
        pq.delMax();
        System.out.println(pq.toString());
    }
}
