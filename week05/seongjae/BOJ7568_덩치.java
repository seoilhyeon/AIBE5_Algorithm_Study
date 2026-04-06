package week05.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ7568_덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] wit = new int[N];
        int[] key = new int[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            wit[i] = Integer.parseInt(st.nextToken());
            key[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            int count = 0;
            for(int j = 0; j < N; j++) {
                if(wit[i] < wit[j] && key[i] < key[j])
                    count++;
            }

            sb.append(count + 1).append(" ");
        }
        System.out.println(sb);
    }
}
