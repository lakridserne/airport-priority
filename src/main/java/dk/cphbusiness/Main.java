package dk.cphbusiness;

import dk.cphbusiness.airport.template.Category;
import dk.cphbusiness.airport.template.Passenger;
import dk.cphbusiness.airport.template.Plane;
import dk.cphbusiness.airport.template.Time;
import dk.cphbusiness.algorithm.examples.queues.PriorityQueueUsingHeap;

public class Main {

    public static void main(String[] args) {
       // PriorityQueueUsingHeap<Integer> pq = new PriorityQueueUsingHeap<Integer>();

       // PriorityQueueUsingHeap<Passenger> pq = new PriorityQueueUsingHeap<Passenger>();
        PriorityQueueUsingHeap<Passenger> pq = new PriorityQueueUsingHeap<Passenger>(2);

        Time time = new Time(10,5,6);
        Plane plane = new Plane(time);
        // yyyy-MM-dd
        Passenger p1 = new Passenger(1,time, Category.Monkey, plane);


        Time time2 = new Time(12,10,6);
        Plane plane2 = new Plane(time2);
        // yyyy-MM-dd
        Passenger p2 = new Passenger(1,time2, Category.BusinessClass, plane2);

        Time time3 = new Time(8,20,6);
        Plane plane3 = new Plane(time3);
        // yyyy-MM-dd
        Passenger p3 = new Passenger(1,time3, Category.Monkey, plane3);

        Time time4 = new Time(9,40,50);
        Plane plane4 = new Plane(time4);
        // yyyy-MM-dd
        Passenger p4 = new Passenger(1,time4, Category.Monkey, plane4);



        pq.enqueue(p1);
        System.out.println(pq.toString());
        pq.enqueue(p2);
        System.out.println(pq.toString());
        //pq.size();
      //  System.out.println(pq.toString());

//        System.out.println(pq.toString());
        // pq.delMax();
//        System.out.println(pq.toString());
//        pq.delMax();
//        System.out.println(pq.toString());
//        pq.delMax();
//        System.out.println(pq.toString());
    }
}
