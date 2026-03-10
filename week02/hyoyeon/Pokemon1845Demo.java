import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Pokemon1845Demo {
    public static int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int kindCount = map.size();
        int maxPick = nums.length / 2;

        return Math.min(kindCount, maxPick);
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        System.out.println(Arrays.toString(nums1) + " -> " + solution(nums1)); // 2
        System.out.println(Arrays.toString(nums2) + " -> " + solution(nums2)); // 3
        System.out.println(Arrays.toString(nums3) + " -> " + solution(nums3)); // 2
    }
}
