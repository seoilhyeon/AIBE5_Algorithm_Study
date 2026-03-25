package week04.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 1;
        int i = 1;

        while (N > 1) {
            N = N - i * 6;
            i++;
            cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}
