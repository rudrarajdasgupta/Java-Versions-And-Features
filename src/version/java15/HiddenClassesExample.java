package version.java15;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class HiddenClassesExample {
    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodType type = MethodType.fromMethodDescriptorString("()V", null);
        Class<?> hiddenClass = lookup.defineHiddenClass(null, true).lookupClass();

        hiddenClass.getDeclaredConstructor().newInstance();

        // Use the hiddenClass instance
    }
}
