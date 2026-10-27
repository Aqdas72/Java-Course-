package JavaCollectionFramework.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
    public static void main(String[] args) {

        //! all properties are same of ArrayList except the clone() method

        LinkedList<Integer> arr = new LinkedList<>();
        List<Integer> hello = new LinkedList<>();
        Collection<Integer> collection = new LinkedList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);//[10,20,30]

        arr.remove(2);
        System.out.println(arr);

        //* addAll
        LinkedList<Integer> arr2 = new LinkedList<>();
        arr2.add(12);
        arr2.add(34);

        arr.addAll(arr2);
        System.out.println(arr);

        arr.removeAll(arr2);
        arr.add(13);
        System.out.println(arr);
        System.out.println(arr.size());

        //* Iterator -
        System.out.println("Use of iterator()");
        LinkedList<Integer> list = new LinkedList<>();

        list.add(13);
        list.add(12);
        list.add(10);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println("Element : " + iterator.next());
        }
        //* get()
        System.out.println(list.get(1));

        //* set()
        list.set(1, 14);
        System.out.println("Updated value : "+list);

        //* toArray() - converts the list into an array 
        Object[] array = list.toArray();
        for(Object val:array){
            System.out.println(val);
        }

        //* sort()
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(18);
        list2.add(13);
        list2.add(30);
        list2.add(1);
        System.out.println("Printing elements of list2 : " + list2);

        //?sorting list2
        Collections.sort(list2);
        System.out.println("printing elements of list2 after sorting : " + list2);

        //* clone()
        //?LinkedList<Integer> list3 = (LinkedList<Integer>)list2.clone();
        //?System.out.println("Cloned list : " + list3);

        //* ensureCapacity() - asign a minimum capacity to an arrayList
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);//here the min capacity of asigning element is 100

        System.out.println(marks.isEmpty());
        System.out.println(list.isEmpty());

        System.out.println(list2.indexOf(14));

        //*Since linkedlist also implements the Queue and Deque interface 
        // thus it also follow methods of them  */

        System.err.println("Some properties of Queue and deque");
        //1 getfirst() & getlast();
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(14);
        ll.add(24);
        ll.addFirst(12);
        ll.addLast(19);

        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.peek());

        System.out.println(ll.poll());
        System.out.println(ll);
    }
}
