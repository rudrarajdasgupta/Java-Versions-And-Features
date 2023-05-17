package version.java8;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a functional interface
        Converter<String, Integer> converter = (from) -> Integer.parseInt(from);
        int convertedValue = converter.convert("123");
        System.out.println(convertedValue); // Output: 123
    }

    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }
}
