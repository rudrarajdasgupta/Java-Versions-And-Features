package version.java14;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String text = null;
        System.out.println(text.length()); // Throws NullPointerException with enhanced message
    }
}
