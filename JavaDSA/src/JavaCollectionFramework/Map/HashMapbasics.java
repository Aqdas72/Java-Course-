
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class HashMapbasics {
    public static void main(String[] args) {
        //Map - store the element in key-value pair
        Map<String , String> map = new HashMap<>();

        //*what is we use HashMap() , LinkedHashMap() and TreeMap()  */
        Map<Integer,String> map1 = new TreeMap<>();
        map1.put(2, "two");
        map1.put(3, "three");
        map1.put(1, "One");
        //? System.out.println("Printing: " + map1);//HashMap() - {1=One, 2=two, 3=three} [RANDOM]
        //? System.out.println("Printing: " + map1); //LinkedHashMap() - {2=two, 1=One, 3=three} [SAME]
        //? System.out.println("Printing: " + map1);// TreeMap() - {1=One, 2=two, 3=three} [SORTED]


        //? insertion
        map.put("in", "India");
        map.put("in", "India2");//here the value gets updated if same key 
        map.put("us", "United States");
        map.put("en", "England");
        System.out.println(map);

        Map<String , String> table = new HashMap<>();
        table.put("br", "Brazil");

        System.out.println("Before: " + table);

        //? putAll() - insert all the value of specific collection into it
        table.putAll(map);

        System.out.println("After: " + table);

        //? remove(key)
        map.remove("in");
        System.out.println(map);

        //? putifAbsent(k,v)
        map.putIfAbsent("in", "India");
        System.out.println(map);

        System.out.println(map.get("en"));

        System.out.println(map.getOrDefault("em", "Not found"));

        System.out.println(map.containsKey("in"));
        System.out.println(map.containsValue("Brazil"));

        System.out.println(map);

        //?replace(k,v)
        map.replace("in", "switzerland");
        System.out.println(map);

        //? keySet()
        Set<String> ks = table.keySet();
        System.out.println(ks);//[br, in, en, us]

        //? values()
        Collection<String> valueSet = table.values();
        System.out.println(valueSet);


        //?get all the entries from map
        Set<Map.Entry<String , String>> entries = table.entrySet();
        System.out.println("Printing Entries: " + entries);

        for (Map.Entry<String, String> en : table.entrySet()) {
            System.out.println(en.getKey() + " : " + en.getValue());
        }
        /*map.clear();
        System.out.println(map);
        System.out.println(map.size());*/

    }
}
