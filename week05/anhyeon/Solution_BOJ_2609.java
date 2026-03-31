package week05.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int A = a;
        int B = b;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        int gcd = a;
        int lcm = (A * B) / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

        sc.close();
    }
}
