package version.java16;

public class RecordClassesExample {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30);
        System.out.println(person.name()); // Output: John Doe
        System.out.println(person.age()); // Output: 30
        System.out.println(person); // Output: Person[name=John Doe, age=30]
    }
}
