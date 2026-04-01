package week05.ilhyeon;

import java.util.Scanner;

public class Solution_BOJ_2023 {

    static int N;
    static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        backtrack(0, 0);
        System.out.print(sb.toString());
    }

    static void backtrack(int cur, int k) {
        if (k >= N) {
            sb.append(cur).append("\n");
            return;
        }

        for (int i = 0; i < 10; i++) {
            int next = cur * 10 + i;
            if (isPrime(next)) {
                backtrack(next, k + 1);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
