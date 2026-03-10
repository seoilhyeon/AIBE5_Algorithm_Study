package week01.juhyeon;

import java.util.*;

class Solution_SWEA_1209 
{
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T=10;
 
        for(int test_case = 1; test_case <= 10; test_case++)
        {
            sc.nextLine();
            int[][] arr = new int[100][100];
            int max = 0;
            int sumColumn, sumRow, sumDiagonal=0;
             
            // 입력받으면서 가로 바로 계산
            for(int i=0; i<100; i++) {
                sumRow = 0;
                StringTokenizer stz = new StringTokenizer(sc.nextLine());
                for(int j=0; j<100; j++) {
                    arr[i][j] = Integer.parseInt(stz.nextToken());
                    sumRow = sumRow + arr[i][j];
                }
                max = Math.max(max, sumRow);
            }
            //세로 계산
            for(int i=0; i<100; i++) {
                sumColumn = 0;
                for(int j=0; j<100; j++) {
                    sumColumn = sumColumn + arr[j][i];
                }
                max = Math.max(max, sumColumn);
            }
            //오른쪽 아래 향하는 대각선 계산
            for(int i=0; i<100; i++) {
                sumDiagonal = sumDiagonal + arr[i][i];
            }
            max = Math.max(max, sumDiagonal);
            sumDiagonal=0;
            //반대 대각선 계산
            for(int i=0; i<100; i++) {
                sumDiagonal = sumDiagonal + arr[i][99-i];
            }
            max = Math.max(max, sumDiagonal);
             
            System.out.println("#"+test_case+" "+max);
        }
    }
}
 
/*
* 
* T 입력받기 (테스트케이스 수)
* for(test_case -> t)
*   arr[100][100] 숫자 저장할 배열 선언
*   max 최댓값 선언 후 0으로 초기화
*   sumColumn, sumRow, sumDiagonal 선언
* 
*   for(i -> 100) 가로는 입력 받으면서 바로 계산
*       sumRow=0 초기화
*       for(j -> 100)
*           arr[i][j] 에 값 저장
*           sumRow += arr[i][j]
*       Math.max(max, sumRow);
* 
*   for(i -> 100) 세로 계산
*       sumColumn=0 초기화
*       for(j -> 100)
*           sumColumn += arr[j][i]
*       Math.max(max, sumColumn)
* 
*   for(i -> 100) 오른쪽아래 대각선 계산
*       sumDiagonal += arr[i][i]
*   Math.max(max, sumDiagonal)
*
*   sumDiagonal = 0 초기화
*   for(i=1 -> 100) 왼쪽 아래 대각선 계산
*       sumDiagonal += arr[i][99-i]
*   Math.max(max, sumDiagonal)
*
*   max 출력
*/