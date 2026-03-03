package week01.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_BOJ_1940_hash {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean[] appear = new boolean[100001];
            int count = 0;
            for (int i = 0; i < n; i++) {
                int num = Integer.parseInt(st.nextToken());
                int target = m - num;
                if (target >= 0 && target <= 100000 && appear[target]) {
                    count++;
                }
                appear[num] = true;
            }

            System.out.println(count);
        }
    }
}
