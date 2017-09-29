package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinFracToDecFrac_Test1 {

	@Test
	public void test() {
		String input = "1010.01";
		double result = Convert.BinFracToDecFrac(input);
		assertEquals(10.25, result, .01);
	}

}
