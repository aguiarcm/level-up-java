package org.example.advanced;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        PriorityQueue<Prioritize> queue = new PriorityQueue<>();
        queue.add(new Prioritize("Object 1", 1));
        queue.add(new Prioritize("Object 2", 5));
        queue.add(new Prioritize("Object 3", 3));
        queue.add(new Prioritize("Object 4", 3));
        queue.add(new Prioritize("Object 5", 2));

        while (!queue.isEmpty()) {
            Prioritize p = queue.poll();
            System.out.println(p.value);
        }

    }

    static class Prioritize implements Comparable<Prioritize> {
        String value;
        int priority;

        Prioritize(String value, int priority) {
            this.value = value;
            this.priority = priority;
        }

        @Override
        public int compareTo(Prioritize o) {
            if (this.priority > o.priority) return -1;
            if (this.priority < o.priority) return 1;
            return 0;
        }
    }
}
