package foo;

/**
 * Foo class
 */
public class Foo {

    private Foo() {
        // Hide implicit public constructor
    }

    // SonarQube Issue: Hardcoded credentials
    private static final String DB_PASSWORD = "admin123";

    public static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new UnsupportedOperationException("Can't divide by zero!");
        }
        return a / b;
    }

    // SonarQube Issue: SQL Injection vulnerability
    public static String getUserData(String userId) {
        String query = "SELECT * FROM users WHERE id = " + userId;
        return query;
    }

    // SonarQube Issue: Null pointer dereference risk
    public static int getLength(String str) {
        return str.length(); // Potential null pointer
    }

    // SonarQube Issue: Unused variable and dead code
    public static void processData(int value) {
        int unused = value * 2; 
        System.out.println("Processing...");
    }

    // SonarQube Issue: Empty catch block
    public static void riskyOperation() throws InterruptedException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw e;
        }
    }

}