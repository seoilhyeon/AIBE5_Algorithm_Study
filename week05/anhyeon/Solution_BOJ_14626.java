package week05.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_14626 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split("");

        int sum = 0;
        int miss = 0;

        for (int i = 0; i < 13; i++) {
            if (arr[i].equals("*")) {
                miss = i;
            } else if (i % 2 == 0) {
                sum += Integer.parseInt(arr[i]);
            } else {
                sum += 3 * Integer.parseInt(arr[i]);
            }
        }

        int weight = (miss % 2 == 0) ? 1 : 3;

        for (int i = 0; i <= 9; i++) {
            if ((sum + i * weight) % 10 == 0) {
                System.out.println(i);
                break;
            }
        }

        sc.close();
    }
}
