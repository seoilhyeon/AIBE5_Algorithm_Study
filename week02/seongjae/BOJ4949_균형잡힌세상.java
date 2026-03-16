package week02.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949_균형잡힌세상 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;

        while(true) {
            s = br.readLine();
            if(s.equals("."))	break;				//입력의 종료조건으로 맨 마지막에 온점 하나(".")가 들어온다. equals는 문자열 비교구문이라, 하나만 들어와야 종료됨.

            sb.append(solved(s)).append("\n");
        }

        System.out.println(sb);
    }

    public static String solved (String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '(' || c == '[')		stack.push(c);

            else if(c == ')') {
                if(stack.empty() || stack.peek() != '(') return "no";
                else	stack.pop();
            }

            else if(c == ']') {
                if(stack.empty() || stack.peek() != '[') return "no";
                else	stack.pop();
            }

        }
        if (stack.empty())	return "yes";
        else				return "no";
    }

}