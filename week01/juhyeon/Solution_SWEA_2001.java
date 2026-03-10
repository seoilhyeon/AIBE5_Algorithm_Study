package week01.juhyeon;

import java.util.*;

public class Solution_SWEA_2001 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=Integer.parseInt(sc.nextLine());
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            StringTokenizer stz = new StringTokenizer(sc.nextLine());
            int n = Integer.parseInt(stz.nextToken()); // 배열 크기
            int m = Integer.parseInt(stz.nextToken()); // 파리채 크기
            int[][] fly = new int[n][n];
             
            for(int i=0; i<n; i++) {
                stz = new StringTokenizer(sc.nextLine());
                for(int j=0; j<n; j++) {
                    fly[i][j] = Integer.parseInt(stz.nextToken());
                }
            }
            int maxFly = 0; //제일 많이 잡은 파리수 저장할 변수
            for(int i=0; i<=n-m; i++) {
                for(int j=0; j<=n-m; j++) {
                    int count=0;
                    for(int p=i; p<i+m; p++) {
                        for(int k=j; k<j+m; k++) {
                            count = count+fly[p][k];
                        }
                    }
                    maxFly = (count>maxFly)? count:maxFly;
                }
            }
            System.out.println("#"+test_case+" "+maxFly);
        }
    }
}
 
/*
* 
* T 입력받기 (테스트케이스 수)
* for(test_case -> T) 
*   int n (배열의 크기 입력받기  5<=n<=15)
*   int m (파리채의 크기 입력받기 2<=m<=n)
*   int[][] fly (파리 수 넣을 이차원 배열)
* 
*   for(i -> n)
*       for(j -> n)
*           fly[i][j] 에 파리 수 넣기
* 
*   int maxFly (많은 파리 수 저장할 변수 선언)
*   
*   for(i -> n-m)
*       for(j -> n-m)
*           for(p=i -> i+m)
*               for(k=j -> i+m
*                   fly[p][k] 에서 시작해서 m*m 만큼 파리수 더해주기
*           maxFly와 비교해서 더 큰 수 저장하기
*   
*   maxFly 출력
*/
