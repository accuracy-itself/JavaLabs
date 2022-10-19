package First;

import java.util.Scanner;

public class Task6
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = numbers[(i + j) % n];
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
