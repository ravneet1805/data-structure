// 4. Design and implement a basic hash map class with operations for insertion, deletion, and retrieval.

import java.util.*;

class CustomHashMap<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 16;
    private Entry<K, V>[] table;

    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        table = new Entry[SIZE];
    }

    private int getIndex(K key) {
        return key.hashCode() % SIZE;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Entry<K, V> newEntry = new Entry<>(key, value);
        
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry<K, V> curr = table[index];
            while (curr.next != null) {
                if (curr.key.equals(key)) {
                    curr.value = value; // Update existing key
                    return;
                }
                curr = curr.next;
            }
            curr.next = newEntry;
        }
    }

    public V get(K key) {
        int index = getIndex(key);
        Entry<K, V> curr = table[index];

        while (curr != null) {
            if (curr.key.equals(key)) {
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        Entry<K, V> curr = table[index];
        Entry<K, V> prev = null;

        while (curr != null) {
            if (curr.key.equals(key)) {
                if (prev == null) {
                    table[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        CustomHashMap<Integer, String> map = new CustomHashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        System.out.println(map.get(1)); // One
        System.out.println(map.get(2)); // Two
        map.remove(1);
        System.out.println(map.get(1)); // null
    }
}
