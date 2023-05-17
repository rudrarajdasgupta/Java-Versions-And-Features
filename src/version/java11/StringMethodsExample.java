package version.java11;

public class StringMethodsExample {
    public static void main(String[] args) {
        String text = "   Hello, World!   ";

        System.out.println(text.isBlank()); // Output: false

        String strippedText = text.strip();
        System.out.println(strippedText); // Output: "Hello, World!"

        String lowerCaseText = text.toLowerCase();
        System.out.println(lowerCaseText); // Output: "   hello, world!   "
    }
}
