package week01.ilhyeon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_BOJ_11659 {

    public static void main(String[] args) throws Exception {
        // try-with-resources 문법 이용
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            // 입력 & 합배열 구성 => 구간합 O(1)
            long[] S = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
            }

            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < m; c++) {
                st = new StringTokenizer(br.readLine());
                int i = Integer.parseInt(st.nextToken()), j = Integer.parseInt(st.nextToken());

                long res = S[j] - S[i - 1];
                sb.append(res).append("\n");
            }

            bw.append(sb).flush();
        }
    }
}
