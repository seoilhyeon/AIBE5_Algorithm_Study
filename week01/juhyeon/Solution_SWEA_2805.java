package week01.juhyeon;

import java.util.*;
 
class Solution_SWEA_2805
{
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T=Integer.parseInt(sc.nextLine());
 
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = Integer.parseInt(sc.nextLine()); //농장 크기 입력받기
            int[][] farm = new int[n][n]; //농작물 가치 저장할 농장 이차원 배열
             
            for(int i=0; i<n; i++) {
                String line = sc.nextLine(); //한 줄 저장
                for(int j=0; j<n; j++) {
                    farm[i][j] = line.charAt(j) - '0'; //한글자씩 빼서 농장에 가치 저장
                } 
            }
             
            int value = 0; // 얻을 수 있는 수익
            int halfN = n/2;
            for(int i=0; i<halfN; i++) {
                for(int j=halfN-i; j<=i+halfN; j++) {
                    value = value + farm[i][j];
                }
            }
            for(int i=0; i<n; i++) {
                value = value + farm[halfN][i];
            }
            for(int i=halfN+1; i<n; i++) {
                for(int j=i-halfN; j<n-(i-halfN); j++) {
                    value = value + farm[i][j];
                }
            }
            System.out.println("#"+test_case+" "+value);
        }
    }
}