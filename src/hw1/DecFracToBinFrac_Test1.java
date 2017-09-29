package hw1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DecFracToBinFrac_Test1 {

	@Test
	public void test() {
		double input = 10.25;
		String result = Convert.DecFracToBinFrac(input);
		assertEquals("1010.01", result);
	}

}
