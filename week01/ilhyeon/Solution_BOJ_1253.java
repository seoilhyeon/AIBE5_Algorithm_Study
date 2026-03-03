package week01.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_BOJ_1253 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 10억 => 해시 불가... => 투포인터
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);

            int count = 0;
            for (int i = 0; i < n; i++) {
                int j = 0, k = n - 1;
                while (j < k) {
                    if (j == i) {
                        j++;
                        continue;
                    }

                    if (k == i) {
                        k--;
                        continue;
                    }

                    int sum = nums[j] + nums[k];

                    if (sum == nums[i]) {
                        count++;
                        break;
                    }

                    if (sum < nums[i]) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }

            System.out.println(count);
        }
    }
}
