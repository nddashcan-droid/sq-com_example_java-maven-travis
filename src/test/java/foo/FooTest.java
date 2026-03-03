package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooTest {

  @Test
  public void testAdd() throws Exception {
	assertEquals(2, Foo.div(10, 5));
  }
}
