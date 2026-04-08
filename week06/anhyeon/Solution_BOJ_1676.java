package week06.anhyeon;

import java.util.Scanner;
import java.math.BigInteger;

public class Solution_BOJ_1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        BigInteger num = BigInteger.ONE;

        for (int i = 1; i <= N; i++) {
            num = num.multiply(BigInteger.valueOf(i));
        }

        String s = new StringBuilder(String.valueOf(num)).reverse().toString();
        String[] arr = s.split("");
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("0")) {
                count++;
            } else {
                break;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
