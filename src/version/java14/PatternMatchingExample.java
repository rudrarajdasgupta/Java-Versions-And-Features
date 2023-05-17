package version.java14;

public class PatternMatchingExample {
    public static void main(String[] args) {
        Object object = "Hello";

        if (object instanceof String str) {
            System.out.println(str.toUpperCase()); // Output: HELLO
        } else {
            System.out.println("Not a string");
        }
    }
}
