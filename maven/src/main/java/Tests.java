import static org.junit.Assert.*;

import org.junit.*;;


public class Tests {

	@Test
	public void testReturnString() {
		assertEquals("hello", new Hello().ReturnString("hello"));
	}

}
