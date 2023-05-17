package version.java17;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiImprovementsExample {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5)
                .filter(n -> n % 2 == 0)
                .toList(); // or .collect(Collectors.toList());

        System.out.println(numbers); // Output: [2, 4]
    }
}
