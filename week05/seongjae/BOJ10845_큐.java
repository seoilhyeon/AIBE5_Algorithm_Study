package week05.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10845_큐 {
    static int MX = 1000005;
    static int[] dat = new int[MX];
    static int head, tail = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String input = br.readLine();

            if(input.startsWith("push ")) {
                int value = Integer.parseInt(input.substring(5));
                push(value);

            }
            else if (input.equals("pop")) 	System.out.println(pop());
            else if (input.equals("size")) 	System.out.println(size());
            else if (input.equals("empty"))	System.out.println(empty());
            else if (input.equals("front"))	System.out.println(front());
            else if (input.equals("back"))	System.out.println(back());
        }

    }

    static void push (int x) {

        dat[tail++] = x;
    }

    static int pop() {
        return head >= tail ? -1 : dat[head++];			//head가 pop되어 tail과 상황이 동일시해졌거나 넘어가면, 값이 들어오지 않은, 큐에 들어있는 정수가 없는 경우기때문에 head >= tail
    }

    static int size() {
        return tail - head;
    }

    static int empty() {
        return head == tail ? 1 : 0;
    }

    static int front() {
        return head >= tail ? -1 : dat[head];
    }
    static int back() {
        return head >= tail ? -1 : dat[tail - 1];
    }

}