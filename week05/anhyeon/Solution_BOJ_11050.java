package week05.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int num = 1;

        for (int i = 0; i < K; i++) {
            num = num * (N - i) / (i + 1);
        }

        System.out.println(num);
        sc.close();
    }
}
