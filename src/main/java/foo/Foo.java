package foo;

/**
 * Foo class
 */
public class Foo {

    private Foo() {
        // Hide implicit public constructor
    }

    public static int div(int a, int b) throws ArithmeticException {
    	if (b == 0) {
    		throw new UnsupportedOperationException("Can't divide by zero!");
    	}
        return a / b;  
    }

}
