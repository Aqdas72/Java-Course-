package JavaCollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class QueueBasics {
    public static void main(String[] args) {
        //ways to create it 
        Queue<String> str = new LinkedList<>();
        Queue<String> str2 = new ArrayDeque<>();
        Queue<String> str3 = new PriorityQueue<>();

        str.add("Aqdas");
        str.add("habib");
        System.out.println(str);
        
        System.out.println(str.offer("hello"));//return true if successfuly add element in a Queue

        //* select() & peek()
        System.out.println(str.element());//return first element of a queue + 
        //System.out.println(str2.element());//return an exception if queue is empty

        System.out.println(str.peek());//return the first element + return NULL if queue is empty
        System.out.println(str2.peek());

        //* remove() & poll() - both return + remove first element but remove() throws an exception whereas
        //                      poll() return NULL if the queue is empty

        System.out.println("remove()");
        System.out.println("Removing first element: " + str.remove());
        //System.out.println(str2.remove());

        System.out.println("removing first element using poll(): " + str.poll());
        System.out.println(str);
        System.out.println(str2.poll());
    }
}
