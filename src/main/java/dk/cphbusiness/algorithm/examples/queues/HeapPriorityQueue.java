package dk.cphbusiness.algorithm.examples.queues;

import dk.cphbusiness.airport.template.Passenger;
import java.util.NoSuchElementException;

/**
 * An implementation of a queue using a fixed, non-expandable array whose
 * capacity is set in its constructor.
 * @author mbeg

 */
public class NotPrioritisingPassengerArrayQueue implements PriorityQueue<Passenger> {
    private final Passenger[] items;
    private int size = 0;
    private int head = 0; // index of the current front item, if one exists
    private int tail = 0; // index of next item to be added

    public NotPrioritisingPassengerArrayQueue(int capacity) {
      //items = (T[])new Object[capacity];
      items = new Passenger[capacity];
      }
      public void enqueue(int Arr[ ], int val)
      {
          length = length + 1;
          Arr[ length ] = -1;  //assuming all the numbers greater than 0 are to be inserted in queue.
          increase_val (Arr, length, val);
      }
    public void enqueue(Passenger item) {
      if (size == items.length)
          throw new IllegalStateException("Cannot add to full queue");
      items[tail] = item;
      tail = (tail + 1) % items.length;
      size++;
      }

    public Passenger dequeue() {
      if (size == 0)
          throw new NoSuchElementException("Cannot remove from empty queue");
      Passenger item = items[head];
      items[head] = null;
      head = (head + 1) % items.length;
      size--;
      return item;
      }

    public Passenger peek() {
      if (size == 0)
          throw new NoSuchElementException("Cannot peek into empty queue");
      return items[head];
      }

    public int size() {
      return size;
      }
      void max_heapify (int Arr[ ], int i, int N)
{
    int left = 2*i                   //left child
    int right = 2*i +1           //right child
    if(left<= N and Arr[left] > Arr[i] )
          largest = left;
    else
         largest = i;
    if(right <= N and Arr[right] > Arr[largest] )
        largest = right;
    if(largest != i )
    {
        swap (Ar[i] , Arr[largest]);
        max_heapify (Arr, largest,N);
    }
 }

    }
