package aboudou.spring.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Ignore;
import org.junit.Test;

public class ShowIgnore {

	@Test
	@Ignore
	public void testAddition() {
		Math m = new Math();
		assertEquals(4, m.add(4, 2));
		
	}
}
