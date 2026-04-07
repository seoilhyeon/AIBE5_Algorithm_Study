package week06.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_BOJ_13023 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<Integer>[] adjList;
    static boolean[] visited;

    public static void main(String[] args) throws Exception {
        int n = nextInt(), m = nextInt();

        adjList = new List[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = nextInt(), b = nextInt();
            adjList[a].add(b);
            adjList[b].add(a);
        }

        for (int i = 0; i < n; i++) {
            if (dfs(i, 0)) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
    }

    static boolean dfs(int node, int depth) {
        if (depth == 4) {
            return true;
        }

        visited[node] = true;
        for (int next : adjList[node]) {
            if (visited[next])
                continue;

            if (dfs(next, depth + 1))
                return true;
        }

        visited[node] = false;
        return false;
    }

    static int nextInt() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
