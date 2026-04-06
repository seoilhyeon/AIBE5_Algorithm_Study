package week05.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ10816_숫자카드2 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < N; i++) {
            int number_cnt = Integer.parseInt(st.nextToken());
            map.put(number_cnt, map.getOrDefault(number_cnt, 0) + 1);
        }   //등장 횟수 카운팅(없으면 default(0) + 1)

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++) {
            int result = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(result, 0)).append(' ');
        }   //찾는 값이 없으면 기본값 0 / 아니면 key에 해당하는 value


        System.out.println(sb);
    }

}