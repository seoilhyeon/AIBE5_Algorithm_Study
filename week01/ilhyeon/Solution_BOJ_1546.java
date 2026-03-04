package week01.ilhyeon;

import java.util.Scanner;

public class Solution_BOJ_1546 {

    public static void main(String[] args) {
        // try-with-resources 문법 이용
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt(), max = 0;
            int[] scores = new int[n];

            for (int i = 0; i < n; i++) {
                scores[i] = scanner.nextInt();
                max = Math.max(max, scores[i]);
            }

            // 점수 변환 & 합계 계산
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (double) scores[i] / max * 100;
            }

            double avg = sum / n;
            System.out.println(avg);
        }
    }
}
