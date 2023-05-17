package version.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormattingExample {
    public static void main(String[] args) {
        long number = 1_000_000;

        NumberFormat nf = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        String formattedNumber = nf.format(number);

        System.out.println(formattedNumber); // Output: 1M
    }
}
