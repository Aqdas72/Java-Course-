
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class HashSetBasics {

    public static void main(String[] args) {
        
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);


        set1.retainAll(set2);
        System.out.println(set2.containsAll(set1));
        

        
        /* 
        //* all common methods in set
        set1.addAll(set2);
        System.out.println(set1);

        set1.removeAll(set2);
        System.out.println(set1);

        System.out.println(set1.size());

        System.out.println(set1.contains(1));

        Iterator<Integer> iterator = set1.iterator();
        while(iterator.hasNext()){
            System.out.println("Element: " + iterator.next());
        }

        Object[] arr = set1.toArray();
        for(Object val:arr){
            System.out.println(val);
        }
        
        set1.clear();
        System.out.println(set1);
        */

        //? using LinkedHashSet() - given order

        Set<Integer> st = new LinkedHashSet<>();
        st.add(12);
        st.add(15);
        st.add(19);
        System.out.println(st);//[12,15,19]

        //? using TreeSet() - sorted ordered
        Set<Integer> st1 = new TreeSet<>();
        st1.add(14);
        st1.add(11);
        st1.add(9);
        st1.add(20);

        System.out.println(st1);//[9,11,14,20]

        //* How to deal with custom Object in Set
        HashSet<Student> set = new HashSet<>();

        Student stu = new Student(12, "Aqdas");
        Student stu2 = new Student(12, "Aqdas");
        Student stu3 = new Student(12, "Aqdas");
    
        set.add(stu);
        set.add(stu2);
        set.add(stu3);
        System.out.println(set);
    }
}
