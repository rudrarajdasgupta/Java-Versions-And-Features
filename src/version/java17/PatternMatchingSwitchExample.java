package version.java17;

public class PatternMatchingSwitchExample {
    public static void main(String[] args) {
        Object obj = 5;

        int value = switch (obj) {
            case Integer i -> i;
            case String s -> Integer.parseInt(s);
            case Double d && d > 0 -> d.intValue();
            default -> throw new IllegalArgumentException("Unsupported type: " + obj.getClass());
        };

        System.out.println(value); // Output: 5
    }
}
