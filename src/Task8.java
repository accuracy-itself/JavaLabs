package First;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n, m;

        n = in.nextInt();
        int[] sequence1 = new int[n];
        for(int i = 0; i < n; i++)
        {
            sequence1[i] = in.nextInt();
        }

        m = in.nextInt();
        int[] sequence2 = new int[m];
        for(int i = 0; i < m; i++)
        {
            sequence2[i] = in.nextInt();
        }

        int j = 0;
        for(int i = 0; i < n; i++)
        {
            while(sequence2[j] < sequence1[i])
            {
                System.out.println(i);
                j++;
                if(j == m)
                {
                    i = m;
                    break;
                }
            }
        }
        while(j < m)
        {
            System.out.println(n);
            j++;
        }
    }
}
