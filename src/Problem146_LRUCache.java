import java.util.LinkedHashMap;
import java.util.Map;

public class Problem146_LRUCache {
    Map<Integer, Integer> cache;

    public Problem146_LRUCache(int capacity) {
        cache = new MyLinkedHashMap<>(capacity);
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            int value = cache.get(key);
            return value;
        }
        return -1;
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }

    class MyLinkedHashMap<k, v> extends LinkedHashMap<k, v> {
        private int capacity;

        public MyLinkedHashMap(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > capacity;
        }
    }
}
