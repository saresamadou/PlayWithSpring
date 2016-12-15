package aboudou.spring.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestJunit1 {

	@Test
	public void test() {
		int num = 5;
		String temp = null;
		String str = "Junit is working fine";
		
		assertEquals("Junit is working fine", str.toString());
		
		assertFalse(num > 5);
		
		assertNotNull(temp);
	}
}
