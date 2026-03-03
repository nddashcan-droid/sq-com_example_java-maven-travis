package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void testAdd() throws Exception {
	assertEquals(2, Foo.div(10, 5));
  }
  
}package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void testDiv() throws Exception {
    assertEquals(2, Foo.div(10, 5));
  }

  @Test
  public void testDivReturnsOne() throws Exception {
    assertEquals(1, Foo.div(5, 5));
  }

  @Test
  public void testDivWithNegativeDividend() throws Exception {
    assertEquals(-2, Foo.div(-10, 5));
  }

  @Test
  public void testDivWithNegativeDivisor() throws Exception {
    assertEquals(-2, Foo.div(10, -5));
  }

  @Test
  public void testDivWithBothNegative() throws Exception {
    assertEquals(2, Foo.div(-10, -5));
  }

  @Test
  public void testDivWithZeroDividend() throws Exception {
    assertEquals(0, Foo.div(0, 5));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testDivByZeroThrowsException() throws Exception {
    Foo.div(10, 0);
  }

}package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void testDiv() throws Exception {
    assertEquals(2, Foo.div(10, 5));
  }

  @Test
  public void testDivReturnsOne() throws Exception {
    assertEquals(1, Foo.div(5, 5));
  }

  @Test
  public void testDivWithNegativeDividend() throws Exception {
    assertEquals(-2, Foo.div(-10, 5));
  }

  @Test
  public void testDivWithNegativeDivisor() throws Exception {
    assertEquals(-2, Foo.div(10, -5));
  }

  @Test
  public void testDivWithBothNegative() throws Exception {
    assertEquals(2, Foo.div(-10, -5));
  }

  @Test
  public void testDivWithZeroDividend() throws Exception {
    assertEquals(0, Foo.div(0, 5));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testDivByZeroThrowsException() throws Exception {
    Foo.div(10, 0);
  }

  // SonarQube issues below
  @Test
  public void testWithHardcodedPassword() throws Exception {
    String password = "admin123"; // Hardcoded credentials
    String apiKey = "sk-1234567890abcdef"; // Hardcoded API key
    assertEquals(true, password.length() > 0);
  }

  @Test
  public void testWithUnusedVariable() throws Exception {
    int unused = 42; // Unused variable
    assertEquals(2, Foo.div(10, 5));
  }

  @Test
  public void testWithSQLInjection() throws Exception {
    String userInput = "'; DROP TABLE users; --";
    String query = "SELECT * FROM users WHERE id = " + userInput; // SQL Injection risk
    assertNotNull(query);
  }

}
