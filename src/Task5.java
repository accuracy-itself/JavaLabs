package First;

import java.util.Scanner;

public class Task5
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] numbers = new int[n];
		int[] sub = new int[n];
		for(int i = 0; i < n; i++)
		{
			numbers[i] = in.nextInt();
			sub[i] = 1;
		}
		
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if(numbers[j] < numbers[i] && sub[j] + 1 > sub[i])
				{
					sub[i] = sub[j] + 1;
				}
			}
		}
		
		int maxSubLength = 1;
		for(int i = 0; i < n; i++)
		{
			if (sub[i] > maxSubLength)
				maxSubLength = sub[i];
		}
		
		System.out.println(n - maxSubLength);
	}
}