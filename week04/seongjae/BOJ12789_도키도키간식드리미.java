package week04.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ12789_도키도키간식드리미 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> current_st = new Stack<>();
        Stack<Integer> next_st = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        int[] pass = new int[N+1];
        int cnt = 0;
        for(int i = 0; i < N+1; i++){
            pass[i] = cnt++;
        }

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = N - 1; i >= 0; i--){                //FIFO를 위해 역순으로 넣기(그냥 큐 쓰는게 맞았을것 같은.........)
            current_st.push(arr[i]);
        }
        int idx = 1;
        while(!current_st.empty()){
            if(pass[idx] != current_st.peek()){
                next_st.push(current_st.pop());     //peek값이 간식 받을 순서가 아니면 한 명씩 서는 공간(새 스택)으로 옮기기
            } else {                                //idx 값과 일치하면 idx번이 통과된 것이므로 다음 번호
                current_st.pop();
                idx++;
            }

            while(!next_st.empty() && pass[idx] == next_st.peek()){     //idx값이 증가하면서, 꺼낼 수 있는 것은 바로 처리
                next_st.pop();
                idx++;
            }
        }

        if(next_st.empty()){                //위에 바로바로 비교하면서 최종적으로 사람이 남아있다면(순서가 꼬이면 Sad)
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }

    }

}
