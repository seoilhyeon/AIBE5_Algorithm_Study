package week03.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_BOJ_11004 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int N = nextInt(), K = nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = nextInt();
        }

        Arrays.sort(A);
        System.out.println(A[K - 1]);
    }

    private static int nextInt() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
