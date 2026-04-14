package week06.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Solution_BOJ_15649 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static final StringBuilder sb = new StringBuilder();
    static boolean[] used;
    static Deque<Integer> dq = new ArrayDeque<>();
    static int n, m;

    public static void main(String[] args) throws Exception {
        n = nextInt();
        m = nextInt();
        used = new boolean[n + 1];

        backtrack(0);
        System.out.print(sb);
    }

    static void backtrack(int k) {
        if (k == m) {
            for (int e : dq) {
                sb.append(e).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (used[i])
                continue;

            used[i] = true;
            dq.addLast(i);
            backtrack(k + 1);
            dq.pollLast();
            used[i] = false;
        }
    }

    static int nextInt() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
