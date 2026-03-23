package week03.ilhyeon;

import java.util.Scanner;

public class Solution_BOJ_2750_bubble {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = sc.nextInt();
            }

            for (int i = 0; i < N - 1; i++) {
                for (int j = 0; j < N - 1 - i; j++) {
                    if (nums[j] > nums[j + 1]) {
                        int temp = nums[j];
                        nums[j] = nums[j + 1];
                        nums[j + 1] = temp;
                    }
                }
            }

            for (int num : nums) {
                System.out.println(num);
            }
        }
    }
}
