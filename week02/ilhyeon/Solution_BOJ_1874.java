package week02.ilhyeon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution_BOJ_1874 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int n = Integer.parseInt(br.readLine());

            Deque<Integer> dq = new ArrayDeque<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 0, nextNum = 1; i < n; i++) {
                int target = Integer.parseInt(br.readLine());

                while (nextNum <= target) {
                    dq.push(nextNum++);
                    sb.append("+\n");
                }

                if (dq.isEmpty() || dq.peek() != target) {
                    bw.write("NO\n");
                    return;
                }

                dq.pop();
                sb.append("-\n");
            }

            bw.write(sb.toString());
        }
    }
}
