package hw1;
import java.util.*;

public class Convert 
{
	public static int BinToDec(String input)
	{
		return (Integer.parseInt(input, 2));
	}
	
	public static String DecToBin(int input)
	{
		return (Integer.toBinaryString(input));
	}
	
	public static String StrToBin(char[] x1)
	{
		ArrayList<String> output = new ArrayList<>();
		String ret_value = "";
		for (char value: x1)
		{
			output.add(Integer.toBinaryString(value));
		}
		for (String x: output)
		{
			ret_value = ret_value.concat(x);
			ret_value = ret_value.concat(" ");
		}
		
		return (ret_value);
	}
	
	public static String DecFracToBinFrac(double input)
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
		if(fract_part != 0)
		{
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
			ArrayList<Integer> reversed_output_whole_num = new ArrayList<>();
			ArrayList<String> conv_output_whole_num = new ArrayList<>();
			ArrayList<String> conv_output_fract_num = new ArrayList<>();
			String ret_value = "";
			for(int i = BinaryIntegerPart.size()-1; i >= 0; i--)
			{
				reversed_output_whole_num.add(BinaryIntegerPart.get(i));
			}
			for(int x : reversed_output_whole_num)
			{
				conv_output_whole_num.add(Integer.toString(x));
			}
			for(String y : conv_output_whole_num)
			{
				ret_value = ret_value.concat(y);
			}
			ret_value = ret_value.concat(".");
			for(int z : BinaryFractionPart)
			{
				conv_output_fract_num.add(Integer.toString(z));
			}
			for(String w : conv_output_fract_num)
			{
				ret_value = ret_value.concat(w);
			}
			return ret_value;
		}
		else
		{
			throw new ArithmeticException("Input Not Valid!");  
		}
	}
	
	public static double BinFracToDecFrac(String input)
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
			if((x != 1) && (x != 0))
			{
				throw new ArithmeticException("Fraction Part Not Valid!");
			}
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

		return ((double)intpart + frac_part);

	}
}

