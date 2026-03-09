package week01.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_BOJ_1940_two_pointer {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);

            int i = 0, j = nums.length - 1, count = 0;
            while (i < j) {
                int sum = nums[i] + nums[j];

                if (sum == m) {
                    count++;
                    i++;
                    j--;
                } else if (sum < m) {
                    i++;
                } else {
                    j--;
                }
            }

            System.out.println(count);
        }
    }
}
