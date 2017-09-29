package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryToDecimal_Test1 {

	@Test
	public void test() {
		String input = "1010";
		int result = Convert.BinToDec(input);
		assertEquals(10, result);
	}

}
