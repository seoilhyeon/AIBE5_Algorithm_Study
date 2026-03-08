package week01.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_31403 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String A = String.valueOf(a);
        String B = String.valueOf(b);

        System.out.println(a + b - c);
        System.out.println(Integer.parseInt(A + B) - c);

        sc.close();
    }
}
