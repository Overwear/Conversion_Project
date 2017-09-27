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
			System.out.println("2: Decimal to Binary");
			System.out.println("3: Binary to Decimal");
			System.out.println("4: Binary Fraction to Decimal Fraction");
			System.out.println("5: Decimal Fraction to Binary Fraction");
			System.out.println("6: EXIT");
			Scanner scan1 = new Scanner(System.in);
			int s1 = scan1.nextInt();
			switch(s1)
			{
			case 1:
				Convert.StrToBin();
				break;
			case 2:
				Convert.DecToBin();
				break;
			case 3:
				Convert.BinToDec();
				break;
			case 4:
				Convert.BinFracToDecFrac();
				break;
			case 5:
				Convert.DecFracToBinFrac();
				break;
			case 6:
				isRunning = false;
				System.out.println("Exiting Program..");
				scan1.close();
				break;
			default:
				System.out.println("Dude.. Give me a valid condition..");
			}
		}
	}
	
}
