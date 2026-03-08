package week01.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int X, Y;

            if (N % H == 0) {
                Y = H;
                X = N / H;
            } else {
                Y = N % H;
                X = N / H + 1;
            }

            System.out.printf("%d%02d\n", Y, X);
        }

        sc.close();
    }
}
