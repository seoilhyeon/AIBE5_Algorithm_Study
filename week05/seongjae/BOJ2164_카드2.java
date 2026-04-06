package week05.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2164_카드2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++) q.offer(i);

        while(q.size() != 1) {
            q.poll();						//제일 위에 있는거 버림.

            q.offer(q.poll());				//다음(i+1)번째를 제일 아래로 보냄.
        }
        sb.append(q.peek());				//q.peek() : 큐 값출력 []형태 : sb.append(q)

        System.out.println(sb);
    }
}
