package week01.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_BOJ_10986 {

    public static void main(String[] args) throws Exception {
        // try-with-resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            // 나머지 갯수 세기
            int[] count = new int[m];
            int prev = 0;
            count[0] = 1;

            for (int i = 0; i < n; i++) {
                int cur = (prev + Integer.parseInt(st.nextToken())) % m;
                prev = cur;
                count[cur]++;
            }

            long answer = 0;
            for (int c : count) {
                answer += (long) c * (c - 1) / 2;
            }
            System.out.println(answer);
        }
    }
}
