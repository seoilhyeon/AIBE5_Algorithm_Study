package week01.juhyeon;

import java.util.*;

class Solution_SWEA_1215 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = 10;
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int length = Integer.parseInt(sc.nextLine());
            char[][] arr = new char[8][8];
            for(int i=0; i<8; i++) {
                arr[i] = sc.nextLine().toCharArray();
            }
            boolean isRowPalindrome, isColumnPalindrome;
            int count=0;
            for(int i=0; i<8; i++) {
                for(int j=0; j<8; j++) {
                    if(j+length-1 < 8) { //범위 유효성 검사
                        //여부 초기화
                        isRowPalindrome = true;
                        isColumnPalindrome = true;
                        for(int k=0; k<length/2; k++) {
                            if(arr[i][j+k] != arr[i][j+length-k-1]) { //가로 검사
                                isRowPalindrome = false;
                            }
                            if(arr[j+k][i] != arr[j+length-k-1][i]) { //세로 검사
                                isColumnPalindrome = false;
                            }
                        }
                    if(isRowPalindrome) count++;
                    if(isColumnPalindrome) count++;
                    }
                     
                }
            }
            System.out.println("#"+test_case+" "+count);    
        }
    }
}
 
/*
* 
* T=10 (테스트케이스 수)
* for(test_case -> t)
*   length 입력 받기
*   arr[][] 크기가 8*8인 char 배열 선언
*   for(i->8)
*       arr[i][] char 하나씩 배열에 저장
*   isRowPalindrome, isColumnPalindrome 가로, 세로 회문 여부 변수 선언 (초기값 true)
*   count (회문 갯수 변수 선언 후 0으로 초기화)
*   for(i -> 8)
*       for(j -> 8)
*           범위 유효성 검사
*           for(k -> k+length)
*               if(arr[i][j+k] != arr[i][j+length-k-1]) 가로 4개 조사
*                   isRowPalindrome = false
*               if(arr[j+k][i] != arr[j+length-k-1][i]) 세로 4개 조사
*                   isColumnPalindrome = false;
*           if(isRowPalindrome) count++;
*           if(isColumnPalindrome) count++;
*   count 출력
*/