package JavaCollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueBasics {
    public static void main(String[] args) {

        //*How normal Queue works - 
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(40);
        q.offer(30);
        q.offer(10);
        q.offer(50);
        System.out.println("Normal Queue: " + q);

        //* How Priority queue works- 
        Queue<Integer> pq = new PriorityQueue<>();
        //Default Behaviour -> Integer -> less value -> high priority -> minHeap
        pq.offer(40);
        pq.offer(20);
        pq.offer(10);
        pq.offer(50);

        System.out.println("Priority Queue: " + pq);
        pq.poll();
        System.out.println(pq);

        Queue<Integer> pq2 = new PriorityQueue<>((a,b)->b-a);
        //here pq2 -> high priority -> high value -> maxHeap
        pq2.offer(40);
        pq2.offer(20);
        pq2.offer(10);
        pq2.offer(50);

        System.out.println("max priority: " + pq2);
    }
}
