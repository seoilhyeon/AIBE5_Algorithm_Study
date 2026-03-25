package week03.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if (num < 2) {
                continue;
            }

            int j;
            for (j = 2; j < num; j++) {
                if (num % j == 0) {
                    break;
                }
            }

            if (j == num) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
