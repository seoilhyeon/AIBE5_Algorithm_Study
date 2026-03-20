package week03.ilhyeon;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_BOJ_11399 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int[] P = new int[N];
            for (int i = 0; i < N; i++) {
                P[i] = sc.nextInt();
            }

            Arrays.sort(P);

            int total = 0;
            for (int i = 0, acc = 0; i < N; i++) {
                acc += P[i];
                total += acc;
            }

            System.out.println(total);
        }
    }
}
