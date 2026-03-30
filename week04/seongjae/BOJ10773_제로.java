package week04.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773_제로 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < T; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                st.push(num);
            } else {
                st.pop();
            }
        }

        int ans = 0;
        while(!st.isEmpty()){
            ans += st.pop();
        }

        System.out.println(ans);
    }
}
