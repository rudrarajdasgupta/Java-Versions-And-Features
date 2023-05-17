package version.java8;

public interface Vehicle {
    void start();

    void stop();

    default void honk() {
        System.out.println("Honking the horn");
    }
}

