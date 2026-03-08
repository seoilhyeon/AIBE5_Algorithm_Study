package week01.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int num = A * B * C;

        String str = String.valueOf(num);

        int[] cnts = new int[10];

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            cnts[digit]++;
        }

        for (int cnt : cnts) {
            System.out.println(cnt);
        }

        sc.close();
    }
}
