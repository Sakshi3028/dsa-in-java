
import java.util.*;

public class HashMap1 {

    static class HashMap<K, V> {

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // Number of entries
        private int N; // Number of buckets
        private LinkedList<Node>[] buckets;

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.n = 0;
            this.buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        public int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi % N);
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for (int i = 0; i < ll.size(); i++) {
                if (Objects.equals(ll.get(i).key, key)) {
                    return i;
                }
            }

            return -1;
        }

        @SuppressWarnings("unchecked")
        public void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;

            N = N * 2;
            buckets = new LinkedList[N];

            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }

            int oldSize = n;
            n = 0;

            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];

                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

            n = oldSize;
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node data = buckets[bi].get(di);
                data.value = value;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            }

            return buckets[bi].get(di).value;
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            return searchInLL(key, bi) != -1;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1) {
                return null;
            }

            Node removed = buckets[bi].remove(di);
            n--;
            return removed.value;
        }

        public boolean isEmpty() {
            return n == 0;
        }

        public int size() {
            return n;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 150);
        map.put("China", 140);
        map.put("USA", 35);

        System.out.println(map.get("India"));
        System.out.println(map.get("China"));
        System.out.println(map.containsKey("USA"));
        System.out.println(map.size());

        map.put("India", 160);
        System.out.println(map.get("India"));

        map.remove("USA");
        System.out.println(map.containsKey("USA"));
    }
}
