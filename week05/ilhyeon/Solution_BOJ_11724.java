package week05.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution_BOJ_11724 {

    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static boolean[] visited;
    static int count;

    public static void main(String[] args) throws Exception {
        int N = nextInt(), M = nextInt();
        List<Integer>[] graph = new List[N + 1];
        for (int i = 1; i <= N; i++)
            graph[i] = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            int u = nextInt(), v = nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        visited = new boolean[N + 1];
        for (int i = 1; i <= N; i++) {
            if (visited[i])
                continue;

            dfs(graph, i);
            count++;
        }

        System.out.println(count);
    }

    static void dfs(List<Integer>[] graph, int node) {
        visited[node] = true;

        for (int next : graph[node]) {
            if (visited[next])
                continue;

            dfs(graph, next);
        }
    }

    static int nextInt() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
