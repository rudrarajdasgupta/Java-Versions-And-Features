package version.java17;

public class SealedClassesExample {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.0);
        Shape shape2 = new Rectangle(3.0, 4.0);

        // Use shape1 and shape2 polymorphically
    }
}
