package week06.anhyeon;

import java.util.*;

public class Solution_BOJ_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, Comparator.comparing(String::length).thenComparing(String::compareTo));

        System.out.println(arr[0]);
        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}
