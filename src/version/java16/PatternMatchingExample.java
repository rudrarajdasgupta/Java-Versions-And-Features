package version.java16;

public class PatternMatchingExample {
    public static void main(String[] args) {
        Object object = "Hello";

        if (object instanceof String str && str.length() > 5) {
            System.out.println(str.toUpperCase()); // Output: HELLO
        } else {
            System.out.println("Not a long string");
        }
    }
}
