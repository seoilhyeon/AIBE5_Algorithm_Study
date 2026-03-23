package week03.ilhyeon;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_BOJ_1427 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char[] digits = sc.next().toCharArray();
            Arrays.sort(digits);
            for (int i = digits.length - 1; i >= 0; i--) {
                System.out.print(digits[i]);
            }
        }
    }
}
