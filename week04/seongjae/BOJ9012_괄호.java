package week04.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ9012_괄호 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            s = br.readLine();
            sb.append(VPS(s)).append("\n");
        }

        System.out.println(sb);

    }

    public static String VPS(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(') st.push(c);

            else if (c == ')') {
                if (st.empty())	return "NO";    //()쌍이 아닌 ) 만 존재할 경우 VPS가 아닌 문자열
                else	st.pop();               //( : push / ) : pop을 하면서 짝을 찾아서 나가기
            }
        }

        if(st.empty())	return "YES";       //()쌍이 모두 만나면 pop을 통해 최종 empty되므로 VPS충족, YES
        else				return "NO";    //하나라도 남아있따면 VPS가 아닌 문자열
    }
}
