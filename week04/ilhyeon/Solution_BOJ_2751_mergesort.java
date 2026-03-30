package week04.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_BOJ_2751_mergesort {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] temp;

    static int nextInt() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws Exception {
        int n = nextInt();

        int[] nums = new int[n];
        temp = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = nextInt();
        }

        mergeSort(nums, 0, n - 1);

        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num).append("\n");
        }
        System.out.print(sb);
    }

    static void mergeSort(int[] nums, int s, int e) {
        if (s >= e)
            return;

        int m = (s + e) >>> 1;
        mergeSort(nums, s, m);
        mergeSort(nums, m + 1, e);
        merge(nums, s, m, e);
    }

    static void merge(int[] nums, int s, int m, int e) {
        int i = s, j = m + 1, k = 0;
        while (i <= m && j <= e) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= m) {
            temp[k++] = nums[i++];
        }

        while (j <= e) {
            temp[k++] = nums[j++];
        }

        for (int idx = 0; idx < k; idx++) {
            nums[s + idx] = temp[idx];
        }
    }
}
