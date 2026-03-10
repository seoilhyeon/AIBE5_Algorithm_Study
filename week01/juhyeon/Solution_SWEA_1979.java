package week01.juhyeon;

import java.util.*;

public class Solution_SWEA_1979 
{
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=Integer.parseInt(sc.nextLine());
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            StringTokenizer stz = new StringTokenizer(sc.nextLine());
            int n = Integer.parseInt(stz.nextToken()); // 퍼즐의 가로 세로 길이
            int k = Integer.parseInt(stz.nextToken()); // 단어 길이
            boolean[][] puzzle = new boolean[n][n]; //퍼즐 모양 저장할 배열
            //퍼즐 모양 저장하기
            for(int i=0; i<n; i++) {
                stz = new StringTokenizer(sc.nextLine());
                for(int j=0; j<n; j++) {
                    //1=흰색=true 0=검은색=false
                    if(stz.nextToken().equals("1")) puzzle[i][j] = true;
                    else puzzle[i][j] = false;
                }
            }
            int count=0; //가능한 자리수 저장
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    if(puzzle[i][j]) {
                        //가로 범위 확인 
                        if(j <= n-k) {
                            // 끝이거나 전 칸이 검은색인지 확인
                            if(j==0 || !puzzle[i][j-1]) {
                                //k칸 확인
                                for(int m=j+1; m<j+k; m++) {
                                    if(!puzzle[i][m]) break;
                                    if(m==j+k-1) {
                                        if(j+k == n || !puzzle[i][j+k]) count++;
                                    }
                                }
                            }
                             
                        }
                        //세로 범위 확인 후 k칸 확인
                        if(i <= n-k) {
                            // 끝이거나 전 칸이 검은색인지 확인
                            if(i==0 || !puzzle[i-1][j]) {
                                //k칸 확인
                                for(int m=i+1; m<i+k; m++) {
                                    if(!puzzle[m][j]) break;
                                    if(m==i+k-1) {
                                        if(i+k == n || !puzzle[i+k][j]) count++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("#"+test_case+" "+count);
        }
    }
}
 
/*
* 
* T 입력받기 (테스트케이스 수)
* for(test_case -> T) 
*   int n (퍼즐의 가로 세로 길이 입력 받기)
*   int k (단어 길이 입력 받기)
*   boolean[][] puzzle (퍼즐모양 저장할 배열 선언)
*   for(i -> n)
*       for(j -> n)
*           흰색=1=true 검은색=0=false로 저장
*           if(1) puzzle[i][j] = true
*           else puzzle[i][j] = false
*   int count (자리 수 저장할 변수 선언)
*   for(i -> n) 
*       for(j -> n)
*           if(puzzle[i][j]) 만약 흰색이라면
*               가로 범위 배열 유효성 검사
*               전 칸이 검은색인지 확인
*               for(m=j+1 -> j+k) 가로 조사
*                   만약 검은색이라면 반복문 중단
*                   if(!puzzle[i][m]) break; 
*                   if(m==j+k-1) k칸이 흰색이고 끝에 다다랐을 때 
*                       다음이 검은색 타일이거나 끝이라면
*                       count++; count 증가
*               세로 범위 배열 유효성 검사
*               전 칸이 검은색인지 확인
*               for(m=i+1 -> i+k) 세로 조사
*                   만약 검은색이라면 반복문 중단
*                   if(!puzzle[i][m]) break; 
*                   if(m==i+k-1) k칸이 흰색이고 끝에 다다랐을 때
*                       다음이 검은색 타일이거나 끝이라면
*                       count++; count 증가
*   count 출력
*/