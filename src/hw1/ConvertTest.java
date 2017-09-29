package hw1;
import java.util.*;

public class ConvertTest 
{	
	public static void main (String[] args)
	{
		boolean isRunning = true;
		while(isRunning)
		{
			System.out.println("");
			System.out.println("What do you want to convert?");
			System.out.println("1: String to Binary");
			System.out.println("2: Decimal Integer to Binary");
			System.out.println("3: Binary to Decimal Integer");
			System.out.println("4: Binary Fraction to Decimal Fraction");
			System.out.println("5: Decimal Fraction to Binary Fraction");
			System.out.println("6: EXIT");
			Scanner scan = new Scanner(System.in);
			int s1 = scan.nextInt();
			switch(s1)
			{
			case 1:
				char[] x1;
				System.out.println("Give me a String To Convert Into Binary");
				String input1 = scan.next();
				x1 = input1.toCharArray(); 
				System.out.println(Convert.StrToBin(x1));
				break;
			case 2:
				System.out.println("Give me an Decimal Integer To Convert Into Binary");
				try
				{
					int input2 = scan.nextInt();
					System.out.println(Convert.DecToBin(input2));
				}
				catch(Exception e)	//if input is invalid...
				{
					System.out.println("Dude... give me a valid input..");
				}
				break;
				
			case 3:
				System.out.println("Give me a Binary Number To Convert Into Decimal");
				try
				{
					String input3 = scan.next();
					System.out.println(Convert.BinToDec(input3));
				}
				catch(Exception e)	//if input is invalid...
				{
					System.out.println("Dude... give me a valid input..");
				}
				break;
				
			case 4:
				System.out.println("Give me a Binary Fraction To Convert Into Decimal Fraction");
				try
				{
					String input4 = scan.next();
					System.out.println(Convert.BinFracToDecFrac(input4));
				}
				catch (Exception e)
				{
					System.out.println("Dude... give me a valid input..");
				}
				break;
				
			case 5:
				System.out.println("Give me a Decimal Fraction To Convert Into Binary Fraction");
				try
				{
					double input5 = scan.nextDouble();
					if(input5 < 0)
					{
						throw new ArithmeticException("Input Not Valid!");  
					}
					System.out.println(Convert.DecFracToBinFrac(input5));
				}
				catch (Exception e)
				{
					System.out.println("Dude... give me a valid input..");
				}
				break;
				
			case 6:
				isRunning = false;
				System.out.println("Exiting Program..");
				scan.close();
				break;
			default:
				System.out.println("Dude.. Give me a valid condition..");
			}
		}
	}
	
}
