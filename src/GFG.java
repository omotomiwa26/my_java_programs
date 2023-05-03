// Java program to calculate
// 1^2+2^2+3^2+...
import java.util.*;
import java.lang.*;

class GFG
{
	// Function to calculate sum
	public static int summation(int n)
	{
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += (i * i);

		return sum;
	}

	// Driver code
	public static void main(String args[])
	{
		int n = 2;
		System.out.println(summation(n));
	}
}

// This code is contributed
// by Sachin Bisht
