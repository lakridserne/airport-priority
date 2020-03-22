package dk.cphbusiness.algorithm.examples.queues;


import dk.cphbusiness.airport.template.Passenger;

public class PriorityQueueUsingHeap<T extends Comparable<T>> {

    T[] arr;
    int N = 0;


    public PriorityQueueUsingHeap(int maxN){
       // arr = (T []) new Comparable[2];
        arr = (T[]) new Comparable[maxN + 1];

    }


    //helper methods
    public String toString(){
        StringBuffer sb = new StringBuffer();
        for(int i = 1; i <= N; i ++)
            sb.append(arr[i].toString()+" ");
        return sb.toString();
    }


    public boolean isEmpty(){
        return N == 0;
    }
    private void resize(int capacity){
        T[] copy = (T []) new Comparable[capacity];
        for(int i = 1; i <= N; i ++ )
            copy[i] = arr[i];
        arr = copy;
    }

    private void swim(int k){
        while(k > 1 && less(k/2, k)){
            exch(k/2,k);
            k = k/2;
        }
    }

    private void sink(int k){
        while (2*k < N){
            int j = 2 * k;
            if(j < N && less(j, j +1)) j = j + 1;
            if(less(j, k)) break;
            exch(k,j);
            k = j;
        }
    }

    private boolean less(int i, int j){
        if (arr[i].compareTo(arr[j]) < 0)
            return true;
        return false;
    }

    private void exch(int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }



    public void enqueue(T item) {
        if (N == arr.length - 1)
            resize(2*N + 1);
        arr[++N] = item;
        swim(N);
    }


    public T dequeue() {
        if (isEmpty()) return null;
        T t= arr[1];
        exch(1,N--);
        arr[N+1] = null;
        sink(1);

        //resize this array
        if (N == (arr.length -1)/4) resize((arr.length-1) / 2 + 1);
        return t;
    }


    public T peek() {
        if (N== 0) {
            return null;
        }
        else {
            return arr[0];
        }
    }


    public int size() {
        return N;
    }

}
