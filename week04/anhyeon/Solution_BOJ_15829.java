package week04.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_15829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        String str = sc.next();

        long M = 1234567891;
        long r = 1;
        long hash = 0;

        for (int i = 0; i < L; i++) {
            long val = str.charAt(i) - 'a' + 1;
            hash = (hash + val * r) % M;
            r = (r * 31) % M;
        }

        System.out.println(hash);
        sc.close();
    }
}
