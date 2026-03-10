package week01.juhyeon;

import java.util.*;
 
class Solution_SWEA_11315
{
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=Integer.parseInt(sc.nextLine());
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = Integer.parseInt(sc.nextLine()); // n 입력받기
            boolean arr[][] = new boolean[n][n]; // 돌 유무 저장할 이차원 배열
            //이차원 배열에 돌유무에 따라 t,f 입력받기
            for(int i=0; i<n; i++) {
                String str = sc.nextLine();
                for(int j=0; j<n; j++) {
                    if(str.charAt(j) == 'o') arr[i][j] = true; //돌이 있다면 true로 저장
                    else arr[i][j] = false; //없으면 false
                }
            }
             
            boolean isFiveStone = false; //5개 연속하는지 확인하는 변수
            //배열을 돌면서 돌이 5개 연속하는지 확인
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    if(arr[i][j]) {
                        //가로 4개 확인
                        isFiveStone = fiveStone(arr, i, j, 0, 1);
                        //세로 4개 확인
                        if(!isFiveStone) isFiveStone = fiveStone(arr, i, j, 1, 0);
                        else break;
                        //오른쪽 아래로 가는 대각선 4개 확인
                        if(!isFiveStone) isFiveStone = fiveStone(arr, i, j, 1, 1);
                        else break;
                        //왼쪽 아래로 가는 대각선 4개 확인
                        if(!isFiveStone) isFiveStone = fiveStone(arr, i, j, 1, -1);
                        else break;
                    }
                }
                if(isFiveStone) break;
            }
            // 5개 연속 확인 후 출력
            System.out.print("#"+test_case+" ");
            if(isFiveStone) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean fiveStone(boolean[][] arr, int x, int y, int xPlus, int yPlus) {
        int newX=x, newY=y;
        for(int i=0; i<4; i++) {
            newX += xPlus;
            newY += yPlus;
            //범위 유효성 검사
            if(newX < 0 || newY < 0 || newX >= arr.length || newY >= arr[0].length) return false;
            //돌이 없다면 false 반환
            if(!arr[newX][newY]) return false;
        }
        //모두 다 통과해야 연속 = true
        return true;
    }
}
 
/*
* T 입력받기 (테스트케이스 수)
* for( test_case -> T) 
*   int N 입력받기 (하나의 정수 5 <= N <= 20)
*   boolean[][] arr 이차원 boolean 배열 선언하기 (길이가 n*n인 이차원 문자열)
*   for(i -> n)
*       for(j -> n)
*           arr[][]에 o일때 true, .일때 false 입력받기
*   
*   boolean isFiveStone (돌이 5개 연속하는지 확인하는 변수)
*   for(i -> n)
*       for(j -> n)
*           arr[][]이 만약 true면 가로, 세로, 대각선으로 4개 연속으로 true인지 확인하기
*           만약 한번이라도 연속한 부분이 있으면 반복문 중단하고 출력
* 
*/