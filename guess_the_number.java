import java.util.Scanner;

public class guess_the_number
{
	public static void main(String[] args)
	{
		
		int number = (int)(Math.random() * 10);
		
		Scanner scanner = new Scanner(System.in);
		
		int guess_number = -1;
		
		int guessCount = 0;
		
		while (guess_number != number)
		{
			System.out.print("Enter number from 1 to 10: ");
			guess_number = scanner.nextInt();
			guessCount++;
		}
		
		System.out.println("Congratulations! you guessed the number! It took you " + guessCount + " tries");
		
	}
}