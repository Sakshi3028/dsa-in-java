package set;

import java.util.TreeSet;
import java.util.Set;
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
        set.add(80);
        set.add(23);
        set.add(10);
        set.add(90);
        set.add(50);
        System.out.println(set.first());
        System.out.println(set.last());
        //it is like a BST
        

    }
    
}
