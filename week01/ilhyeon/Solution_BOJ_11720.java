package week01.ilhyeon;

import java.util.Scanner;

public class Solution_BOJ_11720 {

    public static void main(String[] args) throws Exception {
        // try-with-resources 문법 이용
        try (Scanner scanner = new Scanner(System.in);) {
            int n = scanner.nextInt(), sum = 0;
            for (char c : scanner.next().toCharArray()) {
                sum += c - '0';
            }
            System.out.println(sum);
        }
    }
}
