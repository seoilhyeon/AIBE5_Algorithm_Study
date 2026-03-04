package week01.ilhyeon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_BOJ_12891 {

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());

            char[] dna = br.readLine().toCharArray();

            st = new StringTokenizer(br.readLine());
            int[] need = new int[4];
            for (int i = 0; i < 4; i++) {
                need[i] = Integer.parseInt(st.nextToken());
            }

            // 슬라이딩 윈도우 기법
            int i = 0, j = 0, answer = 0;
            int[] count = new int[4];
            while (j < dna.length) {
                count[idx(dna[j++])]++;

                if (j - i == p) {
                    if (isFullfill(count, need))
                        answer++;

                    count[idx(dna[i++])]--;
                }
            }

            System.out.println(answer);
        }
    }

    private static boolean isFullfill(int[] count, int[] need) {
        for (int k = 0; k < 4; k++) {
            if (count[k] < need[k])
                return false;
        }
        return true;
    }

    private static int idx(char c) {
        switch (c) {
            case 'A':
                return 0;
            case 'C':
                return 1;
            case 'G':
                return 2;
            case 'T':
                return 3;

            default:
                return -1;
        }
    }
}
