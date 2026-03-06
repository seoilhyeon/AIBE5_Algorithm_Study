package week01.hyoyeon;

import java.util.Arrays;

/**
 * 프로그래머스 42747 - H-Index
 *
 * 핵심: 인용 횟수를 내림차순 정렬 후,
 *       cit[i] >= i+1 을 만족하는 최대 개수가 H-Index
 * 시간복잡도: O(n log n)
 */
public class PG_HIndex {

    public int solution(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations); // 오름차순 정렬

        int answer = 0;
        for (int i = 0; i < n; i++) {
            // 내림차순 기준 i번째 = 오름차순 기준 (n-1-i)번째
            if (citations[n - 1 - i] >= i + 1) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PG_HIndex sol = new PG_HIndex();
        System.out.println(sol.solution(new int[]{3, 0, 6, 1, 5})); // 3
    }
}
