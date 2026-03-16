package week03.ilhyeon;

import java.util.Scanner;

public class Solution_BOJ_2750 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            final int OFFSET = 1000;
            final int SIZE = OFFSET * 2 + 1;
            int[] count = new int[SIZE];
            for (int i = 0; i < N; i++) {
                count[sc.nextInt() + OFFSET]++;
            }

            for (int i = 0; i < count.length; i++) {
                for (int j = 0; j < count[i]; j++) {
                    System.out.println(i - OFFSET);
                }
            }
        }
    }
}
