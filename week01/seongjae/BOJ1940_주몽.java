package week01.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1940_주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr_N = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());;
        for(int i = 0; i < N; i++) {
            arr_N[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr_N);

        int start_index = 0, end_index = N - 1, count = 0;
        while(start_index < end_index) {
            if(arr_N[start_index] + arr_N[end_index] == M) {
                count++;
                start_index++;
                end_index--;
            } else if (arr_N[start_index] + arr_N[end_index] > M) {
                end_index--;
            } else {
                start_index++;
            }
        }
        System.out.println(count);
    }
}

/*
    연속적인 범위가 아닌, 두 재료를 이용하라 했으므로 윈도우가 필요 없습니다.
    arr[i] + arr[j]만 보면 됩니다.
    즉, 두 원소의 합이므로 양 끝에서 좁혀오는 투 포인터 형식입니다.
    따라서 배열을 오름차순 정렬한다음, 값을 비교하는 형식으로 해결합니다.
 */