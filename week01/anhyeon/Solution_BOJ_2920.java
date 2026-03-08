package week01.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;
            } else if (arr[i] > arr[i + 1]) {
                ascending = false;
            }
        }

        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        sc.close();
    }
}