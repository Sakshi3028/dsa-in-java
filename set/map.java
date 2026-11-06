package set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(4);
        set.add(5);
       System.out.println( set.contains(4));

       Map<Integer,String> map=new HashMap<>();
        map.put(101,"aditya");
       map.put(102, "sakshi");
       System.out.println(map.containsKey(102));
       System.out.println(map.get(102));

    }
}
