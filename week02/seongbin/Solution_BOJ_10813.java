package week02.seongbin;

import java.util.Scanner;

public class Solution_BOJ_10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] basket = new int[N];
        for(int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }
        for(int k = 0; k < M; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int temp = basket[i - 1];
            basket[i - 1] = basket[j - 1];
            basket[j - 1] = temp;
        }
        for(int i = 0; i < N; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
