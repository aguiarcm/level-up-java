package org.example.problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheSample {


    public static void main(String[] args) {

        LRUCache lruCache = new LRUCache(2);
        lruCache.set("Item1", 100);
        lruCache.set("Item2", 200);

        System.out.println(lruCache.memory);

        lruCache.set("Item3", 300);
        System.out.println(lruCache.memory);

    }

    static class LRUCache {
        LinkedHashMap<String, Integer> memory;
        int CAPACITY;
        LRUCache(int capacity) {
            CAPACITY = capacity;
            memory = new LinkedHashMap<>(CAPACITY, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, Integer> eldest) {
                    return size() > CAPACITY;
                }
            };
        }

        Integer get(String key) {
            return memory.get(key);
        }

        void set(String key, Integer value) {
            memory.put(key, value);
        }
    }
}
