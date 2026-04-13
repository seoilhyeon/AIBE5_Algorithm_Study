package week06.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2839_설탕배달 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        StringBuilder sb = new StringBuilder();
        while (true) {
            if (N % 5 == 0) {   //5kg 먼저 연산(더 적은 개수 봉지)
                cnt += N / 5;
                sb.append(cnt); //3kg + 5kg 최종연산
                break;
            }

            N -= 3;
            cnt++;      //3kg 봉지

            if (N < 0) {
                sb.append("-1");
                break;
            }
        }
        System.out.println(sb);
    }
}