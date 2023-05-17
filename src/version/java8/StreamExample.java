package version.java8;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "mango");

        // Filtering and printing elements using streams
        fruits.stream()
              .filter(fruit -> fruit.startsWith("a"))
              .forEach(System.out::println);
        // Output: apple

        // Transforming elements using streams
        fruits.stream()
              .map(String::toUpperCase)
              .forEach(System.out::println);
        // Output: APPLE, BANANA, ORANGE, GRAPE, MANGO

        // Summing the lengths of all fruits using streams
        int totalLength = fruits.stream()
                               .mapToInt(String::length)
                               .sum();
        System.out.println(totalLength); // Output: 26
    }
}
