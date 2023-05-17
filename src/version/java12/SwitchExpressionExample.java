package version.java12;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        String day = "MON";

        int dayNumber = switch (day) {
            case "MON" -> 1;
            case "TUE" -> 2;
            case "WED" -> 3;
            case "THU" -> 4;
            case "FRI" -> 5;
            case "SAT" -> 6;
            case "SUN" -> 7;
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

        System.out.println(dayNumber); // Output: 1
    }
}
