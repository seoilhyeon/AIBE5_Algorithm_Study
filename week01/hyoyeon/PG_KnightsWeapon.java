package week01.hyoyeon;

/**
 * 프로그래머스 136798 - 기사단원의 무기
 *
 * 핵심: 약수는 짝으로 존재 → sqrt(j)까지만 확인
 *       약수 개수가 limit 초과 시 power로 대체
 * 시간복잡도: O(number * sqrt(number))
 */
public class PG_KnightsWeapon {

    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int j = 1; j <= number; j++) {
            int total = 0;

            for (int i = 1; (long) i * i <= j; i++) {
                if (j % i == 0) {
                    if (j / i == i) {
                        total += 1; // 제곱수: 약수 하나만 추가
                    } else {
                        total += 2; // 짝으로 추가
                    }
                }
            }

            if (total > limit) {
                answer += power;
            } else {
                answer += total;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        PG_KnightsWeapon sol = new PG_KnightsWeapon();
        System.out.println(sol.solution(5, 3, 2));   // 10
        System.out.println(sol.solution(10, 3, 2));  // 21
    }
}
