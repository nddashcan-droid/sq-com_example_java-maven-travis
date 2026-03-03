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

}
