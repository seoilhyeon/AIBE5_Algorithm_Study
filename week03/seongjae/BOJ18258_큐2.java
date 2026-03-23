package week03.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ18258_큐2 {
    static int MX = 2000000;
    static int[] dat = new int[MX];
    static int head = 0;
    static int tail = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();

            if (input.startsWith("push ")) {
                int value = Integer.parseInt(input.substring(5));
                push(value);
            } else if (input.equals("pop")) sb.append(pop()).append('\n');
            else if (input.equals("size")) sb.append(size()).append('\n');
            else if (input.equals("empty")) sb.append(empty()).append('\n');
            else if (input.equals("front")) sb.append(front()).append('\n');
            else if (input.equals("back")) sb.append(back()).append('\n');
        }

        System.out.print(sb);

    }

    static void push(int x) {
        dat[tail] = x;
        tail = (tail + 1) % MX;					//원형큐의 형태. tail = (tail +1) % MX;를 하면 배열의 끝을 넘어가면 다시 1로 돌아간다. 이건 후순위 연산 = 그냥 큐에서 tail++와 같음.
    }

    static int pop() {
        if (head == tail) return -1;
        int val = dat[head];
        head = (head + 1) % MX;					//위와 같음.
        return val;
    }

    static int size() {
        return (tail - head + MX) % MX;			//공식처럼 외워두기. 사이즈는 원형큐면 return (tail - head + MX) % MX / back 출력은 dat[(tail - 1(이까지가 그냥 큐) + MX % MX]
    }

    static int empty() {
        return head == tail ? 1 : 0;
    }

    static int front() {
        return head == tail ? -1 : dat[head];
    }

    static int back() {
        return head == tail ? -1 : dat[(tail - 1 + MX) % MX];
    }

}