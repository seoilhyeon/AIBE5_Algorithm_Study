package week02.ilhyeon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Solution_BOJ_17298 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int N = Integer.parseInt(br.readLine());

            int[] A = new int[N];
            int[] NGE = new int[N];
            Arrays.fill(NGE, -1);

            StringTokenizer st = new StringTokenizer(br.readLine());
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i = 0; i < N; i++) {
                A[i] = Integer.parseInt(st.nextToken());

                while (!stack.isEmpty() && A[stack.peek()] < A[i]) {
                    NGE[stack.pop()] = A[i];
                }

                stack.push(i);
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < N; i++) {
                sb.append(NGE[i]).append(" ");
            }
            sb.append("\n");

            bw.write(sb.toString());
        }
    }
}
