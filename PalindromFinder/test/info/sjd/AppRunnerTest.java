package info.sjd;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AppRunnerTest {

	@Test
	public void testGetMaximalPalindrom() {
		Integer result = AppRunner.getMaximalPalindrom();
		
		assertNotNull(result);
		assertEquals(99000099, (int)result);
	}

	@Test
	public void testResultIsPalindrom() {
		boolean condition1 = AppRunner.resultIsPalindrom(12345);
		
		boolean condition2 = AppRunner.resultIsPalindrom(12321);
		
		assertTrue(!condition1);
		
		assertTrue(condition2);
	}

}
