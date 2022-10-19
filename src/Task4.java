package First;
import java.util.Scanner;
import java.lang.Math;

public class Task4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
		{
			arr[i] = in.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			if(IsPrime(arr[i]))
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean IsPrime(int ch)
	{
		if(ch <= 1)
			return false;
		
		for(int i = 2; i <= (int)Math.sqrt(ch); i++)
		{
			if(ch % i == 0)
				return false;
		} 
		
		return true;
	}
}
