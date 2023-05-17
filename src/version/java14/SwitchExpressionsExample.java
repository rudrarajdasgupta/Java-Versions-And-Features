package version.java14;

public class SwitchExpressionsExample {
    public static void main(String[] args) {
        int day = 3;

        String dayName = switch (day) {
            case 1, 8, 15, 22, 29 -> "Monday";
            case 2, 9, 16, 23, 30 -> "Tuesday";
            case 3, 10, 17, 24, 31 -> "Wednesday";
            case 4, 11, 18, 25 -> "Thursday";
            case 5, 12, 19, 26 -> "Friday";
            case 6, 13, 20, 27 -> "Saturday";
            case 7, 14, 21, 28 -> "Sunday";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println(dayName); // Output: Wednesday
    }
}
