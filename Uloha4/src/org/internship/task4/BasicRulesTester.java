package org.internship.task4;

        import java.lang.reflect.Field;
        import java.lang.reflect.Method;
        import java.lang.reflect.Modifier;

/**
 *
 */
public class BasicRulesTester extends junit.framework.Assert {

    private static void validateIdentifier(String identifier) {
        assertTrue("Identifikator " + identifier + " zacina velkym pismenem",
                identifier.charAt(0) == identifier.toLowerCase().charAt(0));
        assertFalse("Identifikator " + identifier + " obsahuje znak _ (podtrzitko)",
                identifier.contains("_"));
    }

    private static void validateConstIdentifier(String identifier) {
        assertTrue("Identifikator konstanty " + identifier + " obsahuje mala pismena",
                identifier.equals(identifier.toUpperCase()));
    }

    public static void testAttributes(Class clazz) {

        for (Field field : clazz.getDeclaredFields()) {
            int mod = field.getModifiers();
            if (Modifier.isStatic(mod) && Modifier.isFinal(mod)) {
                // constant
                validateConstIdentifier(field.getName());
            } else {
                // regular attribute
                assertTrue("Atribut " + field.getName() + " ve tride " +
                        clazz.getName() + " neni private", Modifier.isPrivate(mod));
                validateIdentifier(field.getName());
            }
        }
    }

    public static void testMethods(Class clazz) {

        for (Method method : clazz.getDeclaredMethods()) {
            validateIdentifier(method.getName());
        }
    }

    public static void testMethodsAndAttributes(Class clazz) {
        testAttributes(clazz);
        testMethods(clazz);
    }

}
