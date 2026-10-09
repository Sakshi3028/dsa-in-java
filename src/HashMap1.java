import java.util.*;
public class HashMap1 {
    static class HashMap<K,V>{
        private class Node{
        K key;
        V value;

        public Node(K key, V value){
            this.key=key;
            this.value=value;
        }
        }
        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        @supressWarning("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++){
          this.buckets[i]= new LinkedList<>();
            }
        }
        public int hashFunction(K key){
        int bi=key.hashCode();
       return  Math.abs(bi)  % N;
        }
        private int searchInLL(k key,int bi){
            LinkedList<Node> ll =buckets[bi];
        }
        public void put(K key, V value){
           int bi= hashFunction(key);
           int di=searchInLL(key,bi);
           if(di==-1){
            buckets[bi].add(new Node(key,value));
            n++;
           }else{
            Node data=buckets[bi].get(di);
            data.value=value;
           }
           double lamda=(double)n/N;
             if(lamda > 2.0){

             }
        }
    }
}
