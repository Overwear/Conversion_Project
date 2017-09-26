package hw1;
import java.util.*;

public class Convert 
{
	public static void BinToInt()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a Binary To Convert Into Integer");
		String input = scan.next();
		try
		{
			System.out.println(Integer.parseInt(input, 2));
		}
		
		catch(Exception e)	//if input is invalid...
		{
			System.out.println("Dude... give me a valid input..");
		}
		scan.close();
	}
	
	public static void IntToBin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me an Integer To Convert Into Binary");
		int input = scan.nextInt();
		try
		{
			System.out.println(Integer.toBinaryString(input));
		}
		catch(Exception e)	//if input is invalid...
		{
			System.out.println("Dude... give me a valid input..");
		}
		scan.close();
	}
	
	public static void StrToBin()
	{
		Scanner scan = new Scanner(System.in);
		char[] x1;
		System.out.println("Give me a String To Convert Into Binary");
		String input = scan.nextLine();
		scan.close();
		x1 = input.toCharArray(); 
		for (char value: x1)
		{
			int output = value;
			System.out.print(Integer.toBinaryString(output) + " ");
		}
	}
	
	public static void BinFracToDecFrac()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a Binary Fraction To Convert Into Decimal Fraction");
		double input = scan.nextDouble();
		scan.close();
		int int_part = (int)input;
		ArrayList<Integer> BinaryIntegerPart = new ArrayList<>();
		while (int_part != 0)
		{
			if((int_part % 2 == 1) && (int_part != 1))
			{
				BinaryIntegerPart.add(1);
				int_part = (int_part-1)/2;
			}
			
			if (int_part % 2 == 0)
			{
				BinaryIntegerPart.add(0);
				int_part = int_part/2;
			}
			
			if (int_part == 1)
			{
				BinaryIntegerPart.add(1);
				int_part = 0;
			}
		}
		double fract_part = input - (double)int_part;
		double result_frac;
		ArrayList<Integer> BinaryFractionPart = new ArrayList<>();
		result_frac = fract_part * 2;
		while(result_frac > .00000001)
		{
			if (result_frac > 1)
			{
				BinaryFractionPart.add(1);
				result_frac = result_frac - 1;
				result_frac = result_frac * 2;
			}
			if (result_frac < 1)
			{
				BinaryFractionPart.add(0);
				result_frac = result_frac * 2;
			}
			if (result_frac == 1)
			{
				BinaryFractionPart.add(1);
				result_frac = 0;
			}
		}
		
	}
}
