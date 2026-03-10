package week02.ilhyeon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Solution_BOJ_11003 {

    public static void main(String[] args) throws Exception {
        // 모노톤 덱 + 슬라이딩 윈도우
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            Deque<Node> dq = new ArrayDeque<>();
            for (int i = 0; i < N; i++) {
                Node node = new Node(i, Integer.parseInt(st.nextToken()));

                while (!dq.isEmpty() && i - dq.peekFirst().idx >= L) {
                    dq.pollFirst();
                }

                while (!dq.isEmpty() && dq.peekLast().val >= node.val) {
                    dq.pollLast();
                }

                dq.addLast(node);
                sb.append(dq.peekFirst().val).append(' ');
            }

            bw.append(sb.append('\n')).close();
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
