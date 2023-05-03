// This program calculates the Lowest Common multiple
// for excessively long input values

import java.util.*;

public class LowestCommonMultiple {

	private static long
	lcmNaive(long numberOne, long numberTwo)
	{

		long lowestCommonMultiple;

		lowestCommonMultiple
			= (numberOne * numberTwo)
			/ greatestCommonDivisor(numberOne,
									numberTwo);

		return lowestCommonMultiple;
	}

	private static long
	greatestCommonDivisor(long numberOne, long numberTwo)
	{

		if (numberTwo == 0)
			return numberOne;

		return greatestCommonDivisor(numberTwo,
									numberOne % numberTwo);
	}
	public static void main(String args[])
	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the inputs");
		long numberOne = scanner.nextInt();
		long numberTwo = scanner.nextInt();

		System.out.println(lcmNaive(numberOne, numberTwo));
	}
}
