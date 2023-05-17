package version.java9;

public interface Calculator {
    default int add(int a, int b) {
        return performOperation(a, b);
    }

    default int subtract(int a, int b) {
        return performOperation(a, b);
    }

    private int performOperation(int a, int b) {
        return a + b;
    }
}

