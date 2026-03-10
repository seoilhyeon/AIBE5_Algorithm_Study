import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 1845 - 폰켓몬
 *
 * 핵심 아이디어:
 * 1) 폰켓몬 번호별 개수를 HashMap으로 센다.
 * 2) HashMap의 key 개수 = 서로 다른 종류 수
 * 3) 선택 가능한 최대 마릿수 = nums.length / 2
 * 4) 정답 = Math.min(종류 수, 선택 가능 수)
 */
class Solution {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        // 번호별 개수 세기
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 서로 다른 종류 수
        int kindCount = map.size();

        // 선택 가능한 최대 마릿수
        int maxPick = nums.length / 2;

        // 둘 중 작은 값이 정답
        return Math.min(kindCount, maxPick);
    }
}
