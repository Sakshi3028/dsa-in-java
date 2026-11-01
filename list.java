
import java.util.*;
public class list{
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(1);
         list.add(2);
          list.add(3);
          System.out.println(list.get(2));

        //   list.set(1, 4);
        //   System.out.println(list);
            
          list.addAll(0,List.of(9,8,7));
          System.out.println(list);

          list.remove(0);
           System.out.println(list);

          //  ListIterator<Integer> it= list.listIterator();
          //  while(it.hasNext()){
          //    System.out.println(it.next());
          //  }

          List<Integer> l=List.of(1,2,3,4,5,6,7,8,9);
          List<Integer> l2=List.copyOf(l);
          System.out.println(l);

    }
}