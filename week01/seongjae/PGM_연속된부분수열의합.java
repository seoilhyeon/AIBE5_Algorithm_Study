package week01.seongjae;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int start_index = 0, end_index = 0, sum = sequence[0];
        int count = Integer.MAX_VALUE;
        int[] answer = new int[2];
        while(end_index != sequence.length) {
            if(sum == k) {
                if(count > end_index - start_index) {   //범위 검사 : 더 짧은 범위 출력
                    count = end_index - start_index;
                    answer[0] = start_index;
                    answer[1] = end_index;
                }
                end_index++;
                if(end_index == sequence.length) break;
                sum += sequence[end_index];
            } else if (sum > k) {
                sum -= sequence[start_index];
                start_index++;
            } else {
                end_index++;
                if(end_index == sequence.length) break;
                sum += sequence[end_index];
            }
        }

        return answer;
    }
}
/*
    투포인터의 다른 문제를 들고와서 풀어봤습니다.
    1. 헷갈렸던 부분 :
        if(end_index == sequence.length) break; 이 구문이 약간 얻어걸린 케이스입니다.
        아웃오브바운더리가 뜨길래 예외처리를 하였더니, 테스트가 통과되었습니다.
        end_index++해서 아직 비교가 덜 됐는데 .length에 다다르면 비교가 되기전에 끝날 수도 있는 것 아닌가? 의문이 들었습니다.

        윈도우를 오른쪽으로 확장하며, 조건문을 통해 sum의 값이 올랐다 작아졌다 하며 모든 구문이 검사되게 됩니다.
        (더 긴 구간을 만들 수 없기 때문입니다)
 */