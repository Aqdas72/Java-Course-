package JavaCollectionFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListBasics {
    public static void main(String[] args){
        //list or collection --> interface so there object (X)
        //thus we have

        //ArrayList -> concrete class
        //* Diff way of creating a list
        ArrayList<Integer> arr = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        Collection<Integer> collection = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);//[10,20,30]

        arr.remove(2);
        System.out.println(arr);

        //* addAll
        ArrayList<Integer> arr2 = new ArrayList<>();
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
        List<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(12);
        list.add(10);
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
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
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(18);
        list2.add(13);
        list2.add(30);
        list2.add(1);
        System.out.println("Printing elements of list2 : " + list2);

        //?sorting list2
        Collections.sort(list2);
        System.out.println("printing elements of list2 after sorting : " + list2);

        //* clone()
        ArrayList<Integer> list3 = (ArrayList<Integer>)list2.clone();
        System.out.println("Cloned list : " + list3);

        //* ensureCapacity() - asign a minimum capacity to an arrayList
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);//here the min capacity of asigning element is 100

        System.out.println(marks.isEmpty());
        System.out.println(list.isEmpty());

        System.out.println(list3.indexOf(14));
    }
}
