package week04.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_BOJ_1517 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] temp;

    public static void main(String[] args) throws Exception {
        int N = nextInt();

        temp = new int[N];
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = nextInt();
        }

        System.out.println(mergeSort(A, 0, N - 1));
    }

    static long mergeSort(int[] A, int s, int e) {
        if (s >= e)
            return 0;

        int m = (s + e) >>> 1;
        return mergeSort(A, s, m) + mergeSort(A, m + 1, e) + merge(A, s, m, e);
    }

    static long merge(int[] A, int s, int m, int e) {
        int i = s, j = m + 1, k = s;
        long swap = 0;
        while (i <= m && j <= e) {
            if (A[i] <= A[j]) {
                temp[k++] = A[i++];
            } else {
                swap += j - k;
                temp[k++] = A[j++];
            }
        }
        while (i <= m) {
            temp[k++] = A[i++];
        }
        while (j <= e) {
            temp[k++] = A[j++];
        }
        for (k = s; k <= e; k++) {
            A[k] = temp[k];
        }

        return swap;
    }

    static int nextInt() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
