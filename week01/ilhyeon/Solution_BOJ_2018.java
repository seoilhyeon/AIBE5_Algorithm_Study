package week01.ilhyeon;

import java.util.Scanner;

public class Solution_BOJ_2018 {

    public static void main(String[] args) {
        // try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt(), start = 1, end = 1, sum = 1, count = 0;
            while (end <= n) {
                if (sum == n) {
                    count++;
                    sum -= start++;
                } else if (sum < n) {
                    sum += ++end;
                } else {
                    sum -= start++;
                }
            }
            System.out.println(count);
        }
    }
}
