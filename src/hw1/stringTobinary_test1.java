package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class stringTobinary_test1 {

	@Test
	public void test() {
		String input = "hello";
		char[] x1 = input.toCharArray();
		String result = Convert.StrToBin(x1);
		assertEquals("1101000 1100101 1101100 1101100 1101111 ", result);
	}

}
