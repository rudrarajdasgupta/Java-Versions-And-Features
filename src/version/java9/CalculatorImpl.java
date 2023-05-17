package version.java9;

public class CalculatorImpl implements Calculator {
    public static void main(String[] args) {
        Calculator calculator = new CalculatorImpl();
        System.out.println(calculator.add(5, 3)); // Output: 8
        System.out.println(calculator.subtract(5, 3)); // Output: 8
    }
}
