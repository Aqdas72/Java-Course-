package JavaCollectionFramework.Queue;

import java.util.ArrayDeque;
import java.util.Deque;


public class DequeBasics {
    public static void main(String[] args) {
        //* Deque - here we can add or remove element from both front and back
        Deque<Integer> dq = new ArrayDeque<>();
        Deque<Integer> emptydq = new ArrayDeque<>();

        //* Specific methods of Deque
        dq.add(12);
        dq.addFirst(14);
        dq.addLast(18);
        dq.add(13);
        dq.add(18);

        System.out.println(emptydq.peekFirst());

        //System.out.println(emptydq.element());

        System.out.println("original deque: " + dq);
        dq.removeFirst();
        System.out.println("element removed from front: " + dq);

        dq.removeLast();
        System.out.println("element removed from last: " + dq);
        

        dq.pollLast();
        System.out.println(dq);
        dq.pollFirst();
        System.out.println(dq);


        //* we can aslo use Deque as a stack(LIFO)
        Deque<Integer> stack = new ArrayDeque<>();
        
        //push element 
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack); //[30,20,10]
        
        //pop
        stack.pop();
        System.out.println(stack); //[20,10]

        System.out.println(stack.peek());
    }
}
