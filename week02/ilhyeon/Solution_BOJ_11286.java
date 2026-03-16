package week02.ilhyeon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution_BOJ_11286 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());
            Queue<Integer> pq = new PriorityQueue<>((a, b) -> {
                int absA = Math.abs(a);
                int absB = Math.abs(b);

                if (absA != absB) {
                    return absA - absB;
                }
                return a - b;
            });

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                int x = Integer.parseInt(br.readLine());

                if (x == 0) {
                    sb.append(pq.isEmpty() ? 0 : pq.poll()).append("\n");
                } else {
                    pq.add(x);
                }
            }

            bw.write(sb.toString());
        }
    }
}
