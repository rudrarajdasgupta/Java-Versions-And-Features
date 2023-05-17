package version.java10;

public class VarKeywordExample {
    public static void main(String[] args) {
        var message = "Hello, Java 10!";
        System.out.println(message); // Output: Hello, Java 10!

        var number = 42;
        System.out.println(number); // Output: 42

        var array = new int[]{1, 2, 3, 4, 5};
        for (var element : array) {
            System.out.println(element);
        }
        // Output: 1
        //         2
        //         3
        //         4
        //         5
    }
}
