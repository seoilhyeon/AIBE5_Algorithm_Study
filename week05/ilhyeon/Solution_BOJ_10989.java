package week05.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_BOJ_10989 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int N = nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = nextInt();
        }

        radixSort(nums);

        StringBuilder sb = new StringBuilder();
        for (int n : nums) {
            sb.append(n).append("\n");
        }
        System.out.print(sb);
    }

    static void radixSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int divisor = 1; divisor <= 10000; divisor *= 10) {
            int[] count = new int[10];

            for (int i = 0; i < n; i++) {
                count[arr[i] / divisor % 10]++;
            }

            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            for (int i = n - 1; i >= 0; i--) {
                int digit = arr[i] / divisor % 10;
                temp[count[digit] - 1] = arr[i];
                count[digit]--;
            }

            System.arraycopy(temp, 0, arr, 0, n);
        }
    }

    static int nextInt() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
