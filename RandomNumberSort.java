
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandomNumberSort
{
	public static void main( String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int[] randomNumbers = new int[500];
			Random generator = new Random();
			for (int index =0; index < randomNumbers.length; index++)
				{
					randomNumbers[ index] = generator.nextInt();
				}
			Arrays.sort( randomNumbers );
		//	System.out.println(Arrays.toString(randomNumbers));
			System.out.println("Enter the nth smallest number to be printed::");
      			int n = sc.nextInt();
			System.out.println(randomNumbers[n]);

		}
}
