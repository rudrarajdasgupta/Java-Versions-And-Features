package version.java11;

public class LambdaExample {
    public static void main(String[] args) {
        MathOperation addition = (var a, var b) -> a + b;
        System.out.println(addition.operate(5, 3)); // Output: 8
    }

    interface MathOperation {
        int operate(int a, int b);
    }
}
