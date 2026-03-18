package week03.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution_BOJ_1377 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(br.readLine());

            Node[] nodes = new Node[N];
            for (int i = 0; i < N; i++) {
                nodes[i] = new Node(i, Integer.parseInt(br.readLine()));
            }

            Arrays.sort(nodes, (e1, e2) -> Integer.compare(e1.val, e2.val));

            int maxDist = 0;
            for (int i = 0; i < N - 1; i++) {
                maxDist = Math.max(maxDist, nodes[i].idx - i);
            }

            System.out.println(maxDist + 1);
        }
    }

    static class Node {
        int idx;
        int val;

        public Node(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }
    }
}
