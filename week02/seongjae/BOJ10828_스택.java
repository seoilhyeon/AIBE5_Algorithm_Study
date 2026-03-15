package week02.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10828_스택 {

    static int X = 1000005;
    static int[] dat = new int[X];
    static int pos = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            if (input.startsWith("push ")) {
                int value = Integer.parseInt(input.substring(5));
                push(value);
            }
            else if (input.equals("pop")) {
                System.out.println(pop());
            } else if (input.equals("size")) {
                System.out.println(size());
            } else if (input.equals("empty")) {
                System.out.println(empty());
            } else if (input.equals("top")) {
                System.out.println(top());
            }
        }

    }

    static void push(int x) {
        dat[pos++] = x;		//후위 연산자에 주목. 3일땐 뒤에서 ++해서 4
    }

    static int pop() {
        return pos == 0 ? -1 : dat[--pos];
    }

    static int size() {			//pos는 "다음에 들어갈 위치"이지만, 동시에 "지금까지 들어간 값의 개수"이기도 한다.
        return pos;				//후위 연산자에 주목. 3일땐 뒤에서 ++해서 4를 가르키므로, 지금 pos값이 전체 size가 맞다. pos[0]부터 시작하므로 후위연산자로 1, 2, 3을 하면 -1이 아닌 pos가 사이즈가 되는 것이다.
    }

    static int empty() {
        return pos == 0 ? 1 : 0;
    }

    static int top() {
        return pos == 0 ? -1 : dat[pos - 1];
    }
}

/*
* https://blog.encrypted.gg/933 참조.
* 바킹독을 통해 스택을 학습하였습니다.
* Stack의 원리와 LIFO의 구조를 알게 되었습니다.
* */