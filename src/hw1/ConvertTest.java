package hw1;
import java.util.Scanner;

public class ConvertTest 
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
			scan.close();
			switch(s1)
			{
			case 1:
				Convert.StrToBin();
				break;
			case 2:
				Convert.IntToBin();
				break;
			case 3:
				Convert.BinToInt();
				break;
			case 4:
				String input4;
				System.out.println("Give me a Binary Fraction To Convert Into Decimal Fraction");
				input4 = scan.next();
				//Binary Fraction to Decimal Fraction
				break;
			case 5:
				float input5;
				System.out.println("Give me a Decimal Fraction To Convert Into Binary Fraction");
				input5 = scan.nextFloat();
				//Decimal Fraction to Binary Fraction
				break;
			case 6:
				isRunning = false;
				System.out.println("Exiting Program..");
				break;
			default:
				System.out.println("Dude.. Give me a valid condition..");
			}
		}
	}
	
}
