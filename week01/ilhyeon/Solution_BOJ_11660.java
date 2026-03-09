package week01.ilhyeon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Solution_BOJ_11660 {

    public static void main(String[] args) throws Exception {
        // try-with-resources 활용
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

            // 입력 & 2차원 합 배열 구성
            int[][] S = new int[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= n; j++) {
                    S[i][j] = S[i - 1][j] + S[i][j - 1] - S[i - 1][j - 1] + Integer.parseInt(st.nextToken());
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int c = 0; c < m; c++) {
                st = new StringTokenizer(br.readLine());
                int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());

                int res = S[x2][y2] - S[x1 - 1][y2] - S[x2][y1 - 1] + S[x1 - 1][y1 - 1];
                sb.append(res).append("\n");
            }

            bw.append(sb).flush();
        }
    }
}
