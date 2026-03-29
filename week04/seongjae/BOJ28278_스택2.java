package week04.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ28278_스택2 {

    static int X = 1000005;
    static int[] dat = new int[X];
    static int pos = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            String input_slice[] = input.split(" ");
            if (input_slice[0].equals("1")) {
                push(Integer.parseInt(input_slice[1]));
            }
            else if (input_slice[0].equals("2")) {
                sb.append(pop()).append("\n");
            } else if (input_slice[0].equals("3")) {
                sb.append(size()).append("\n");
            } else if (input_slice[0].equals("4")) {
                sb.append(empty()).append("\n");
            } else if (input_slice[0].equals("5")) {
                sb.append(top()).append("\n");
            }
        }
        System.out.println(sb);

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
