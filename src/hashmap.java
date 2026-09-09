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

        int arr[]={12,13,15};
        for(int i=0;i<3;i++){
            System.out.print(arr[i]+ " ");
        }
         System.out.println();

         for(int val : arr){
             System.out.print(val + " ");
         }
          System.out.println();
    }
}