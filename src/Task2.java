package First;
import java.util.Scanner;

public class Task2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		double x = in.nextDouble(), y = in.nextDouble();
		System.out.println(IsInArea(x, y));
	}
	
	public static boolean IsInArea(double x, double y)
	{
		if((x >= -4 && x <= 4 && y >= 0 && y <= 5)
			|| (x >= -6 && x <= 6 && y >= -3 && y <= 0))
			{
				return true;
			}
			else
				return false;
	}
}