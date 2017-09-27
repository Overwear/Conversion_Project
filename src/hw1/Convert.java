package hw1;
import java.util.*;
import java.util.Scanner;

public class Convert 
{
	public static void BinToDec()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a Binary Number To Convert Into Decimal");
		String input = scan.next();
		try
		{
			System.out.println(Integer.parseInt(input, 2));
		}
		
		catch(Exception e)	//if input is invalid...
		{
			System.out.println("Dude... give me a valid input..");
		}
	}
	
	public static void DecToBin()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me an Decimal To Convert Into Binary");
		int input = scan.nextInt();
		try
		{
			System.out.println(Integer.toBinaryString(input));
		}
		catch(Exception e)	//if input is invalid...
		{
			System.out.println("Dude... give me a valid input..");
		}
	}
	
	public static void StrToBin()
	{
		char[] x1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a String To Convert Into Binary");
		String input = scan.next();
		x1 = input.toCharArray(); 
		for (char value: x1)
		{
			int output = value;
			System.out.print(Integer.toBinaryString(output) + " ");
		}
	}
	
	public static void DecFracToBinFrac()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a Decimal Fraction To Convert Into Binary Fraction");
		double input = scan.nextDouble();
		try
		{
			int int_part = (int)input;
			int int_part2 = int_part;
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
			double fract_part = input - (double)int_part2;
			double result_frac;
			ArrayList<Integer> BinaryFractionPart = new ArrayList<>();
			result_frac = fract_part * 2;
			while(result_frac > .00000001)
			{
				if (result_frac > 1.0)
				{
					BinaryFractionPart.add(1);
					result_frac = result_frac - 1;
					result_frac = result_frac * 2;
				}
				if (result_frac < 1.0)
				{
					BinaryFractionPart.add(0);
					result_frac = result_frac * 2;
				}
				if ((result_frac > .95) && (result_frac < 1.00000001))
				{
					BinaryFractionPart.add(1);
					result_frac = 0;
				}
			}
			for(int i = BinaryIntegerPart.size()-1; i >= 0; i--)
			{
				System.out.print(BinaryIntegerPart.get(i));
			}
			System.out.print(".");
			for(int value:BinaryFractionPart)
			{
				System.out.print(value);
			}
		}
		catch (Exception e)
		{
			System.out.println("Dude... give me a valid input..");
		}
	}
	
	public static void BinFracToDecFrac()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me a Binary Fraction To Convert Into Decimal Fraction");
		String input = scan.next();
		try
		{
			String[] output = input.split("\\.");		//split the input into an array of strings by the decimal point
			String string_whole_part = output[0];		//set the integer part
			String string_frac_part = output[1];		//set the fraction part
			int intpart = Integer.parseInt(string_whole_part, 2);	//convert the integer part into decimal
			String[] fract_array = string_frac_part.split("(?!^)");	//split the fraction string into individual character strings
			double frac_part = 0;									//initialize the resulting decimal converted value
			for (int i = 0; i < fract_array.length; i++)			//this for loop converts the binary fraction value into decimal value
			{
				int x = Integer.parseInt(fract_array[i]);
				if(x == 1)
				{
					double sum = 1.0;
					for (int j = 0; j <= i; j++)
						{
							sum /= 2;
						}
					frac_part += sum;
				}
			}
			double result;
			result = (double)intpart + frac_part;
			System.out.println(result);
		}
		catch (Exception e)
		{
			System.out.println("Dude... give me a valid input..");
		}
	}
}

