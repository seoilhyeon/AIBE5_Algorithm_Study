package week03.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_30802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] participant = new int[6];
        int[] kit = new int[2];

        for (int i = 0; i < 6; i++) {
            participant[i] = sc.nextInt();
        }
        kit[0] = sc.nextInt();
        kit[1] = sc.nextInt();

        int psum = 0;
        for (int i = 0; i < 6; i++) {
            if (participant[i] == 0) {
                psum += 0;
            } else if (participant[i] % kit[0] == 0) {
                psum += participant[i] / kit[0];
            } else {
                psum += participant[i] / kit[0] + 1;
            }
        }
        System.out.println(psum);

        int sum = 0;
        for (int i = 0; i < 6; i++) {
            sum += participant[i];
        }
        System.out.printf("%d %d", sum / kit[1], sum % kit[1]);

        sc.close();

    }
}