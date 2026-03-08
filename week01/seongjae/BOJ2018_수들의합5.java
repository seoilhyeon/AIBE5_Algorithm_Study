package week01.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2018_수들의합5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sum = 1, start_index = 1, end_index = 1, count = 1;

        while(end_index !=  N) {
            if(sum == N) {
                count++;
                end_index++;
                sum += end_index;
            } else if (sum > N) {
                sum -= start_index;
                start_index++;
            } else {
                end_index++;
                sum += end_index;
            }
        }
        System.out.println(count);
    }
}

/*
    연속적인 범위(슬라이딩 윈도우)를 활용한 투 포인터 문제입니다.
    1. count를 1로 잡는 이유?
           -> N 자기 자신도 답에 해당하므로, 미리 넣고 초기화 했기 때문입니다.
           -> 투 포인터 기준으로, 루프에서 N 자기 자신을 찾지 못하기 때문입니다.
    2. 헷갈렸던 부분 :
            if(sum == N) {
                count++;
                end_index++;
                sum += end_index;
            }
        이 조건문에서, 왜 sum의 값이 N에 도달했는데 end_index의 값을 증가하여 또 더하는 건가?
        N의 값을 뛰어넘게 되지 않는가에 대한 의문이 들었습니다.
            -> 다음 경우의 수를 찾기 위해 윈도우를 계속 이동시키기 위해서입니다.
            ex) N == 15이면,
                1+2+3+4+5 = 15가 되고 if문에 의해 +6 = 21(sum > N)인 상태가 됩니다.
                그럼 else if(sum>N)루프로 실행돼, start_index를 증가시키면서
                4 + 5 + 6 = 15로 다음 경우의 수가 발견되게 됩니다.
                이렇게 다른 연속 구간(윈도우)를 계속 발견하게 됩니다.
         이렇게 번거롭게 하지 않고, sum==N이 되면 start_index를 다음으로 위치시키고
         다시 처음부터 더하면 되지 않을까? 생각이 들기도 합니다.
            -> 투포인터 방식이 아닐 뿐더러, 시간복잡도가 O(N^2)으로 기하급수적으로 늘게 됩니다.

 */