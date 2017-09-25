package hw1;
import java.util.Scanner;

public class Convert 
{	
	public static void main (String[] args)
	{
		boolean isRunning = true;
		while(isRunning)
		{
			System.out.println("What do you want to convert?");
			System.out.println("1: String to Binary");
			System.out.println("2: Integer to Binary");
			System.out.println("3: Binary to Integer");
			System.out.println("4: Binary Fraction to Decimal Fraction");
			System.out.println("5: Decimal Fraction to Binary Fraction");
			System.out.println("6: EXIT");
			Scanner scan = new Scanner(System.in);
			int s1 = scan.nextInt();
			
			switch(s1)
			{
			case 1:
				String value1;
				System.out.println("Give me a String To Convert Into Binary");
				value1 = scan.next();
				// String to Binary
				break;
			case 2:
				int value2;
				System.out.println("Give me an Integer To Convert Into Binary");
				value2 = scan.nextInt();
				//Integer to binary
				break;
			case 3:
				System.out.println("Give me a Binary To Convert Into Integer");
				//Binary to Integer
				break;
			case 4:
				System.out.println("Give me a Binary Fraction To Convert Into Decimal Fraction");
				//Binary Fraction to Decimal Fraction
				break;
			case 5:
				System.out.println("Give me a Decimal Fraction To Convert Into Binary Fraction");
				//Decimal Fraction to Binary Fraction
				break;
			case 6:
				isRunning = false;
				System.out.println("Exiting Program..");
			default:
				System.out.println("Dude.. Give me a valid condition..");
			}
		}
	}
	
	//
	public String convert(int value)
	{
		
	}
	
}
