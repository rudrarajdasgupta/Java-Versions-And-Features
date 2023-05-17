package version.java10;

import java.util.List;
import java.util.Map;

public class UnmodifiableCollectionsExample {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");
        fruits.add("mango"); // Throws UnsupportedOperationException

        Map<String, Integer> ages = Map.of("Alice", 25, "Bob", 30, "Charlie", 35);
        ages.put("Dave", 40); // Throws UnsupportedOperationException
    }
}
