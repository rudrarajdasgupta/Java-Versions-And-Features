package version.java8;

public class LambdaExample {
    public static void main(String[] args) {
        // Simple lambda expression
        MathOperation addition = (a, b) -> a + b;
        System.out.println(addition.operate(5, 3)); // Output: 8

        // Lambda expression with multiple statements
        MathOperation subtraction = (a, b) -> {
            int result = a - b;
            return result;
        };
        System.out.println(subtraction.operate(10, 5)); // Output: 5
    }

    interface MathOperation {
        int operate(int a, int b);
    }
}
