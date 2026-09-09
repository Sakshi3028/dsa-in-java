import java.util.*;
public class hashmap{
    public static void main(String args[]){
        HashMap<String,Integer>map = new  HashMap <>();

        // insert
        map.put("India",120);
        map.put("US",30);
        map.put("china",130);
        System.out.println(map);

        // search
        if(map.containsKey("china")){
             System.out.println("key is present");
        }else{
             System.out.println("key is  not present");
        }
    }
}