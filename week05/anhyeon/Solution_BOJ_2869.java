package week05.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        int days = (V - B - 1) / (A - B) + 1;

        System.out.println(days);
        sc.close();
    }
}
