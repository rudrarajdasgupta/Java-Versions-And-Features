package version.java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethodsExample {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "orange");
        System.out.println(fruits); // Output: [apple, banana, orange]

        Set<Integer> numbers = Set.of(1, 2, 3, 4, 5);
        System.out.println(numbers); // Output: [1, 2, 3, 4, 5]

        Map<String, Integer> ages = Map.of("Alice", 25, "Bob", 30, "Charlie", 35);
        System.out.println(ages); // Output: {Alice=25, Bob=30, Charlie=35}
    }
}
