package version.java11;

public class EpsilonGCExample {
    public static void main(String[] args) {
        byte[] data = new byte[10_000_000];
        // Enable Epsilon GC
        System.setProperty("java.vm.gc", "Epsilon");

        System.out.println("Epsilon GC is enabled.");
    }
}
