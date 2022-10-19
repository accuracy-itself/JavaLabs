package First;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++)
        {
            numbers[i] = in.nextInt();
        }

        int exchange;
        for(int i = 0; i < n - 1; i++)
        {
            if(numbers[i] > numbers[i + 1])
            {
                exchange = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = exchange;
                i -= 2;
                if(i < 0)
                    i = -1;
            }
        }

        for(int i = 0; i < n; i++)
            System.out.printf("%d ", numbers[i]);

    }
}
