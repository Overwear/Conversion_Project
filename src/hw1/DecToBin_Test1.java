package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecToBin_Test1 {

	@Test
	public void test() {
		int input = 10;
		String result = Convert.DecToBin(input);
		assertEquals("1010", result);
	}
}
