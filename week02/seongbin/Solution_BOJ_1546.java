package week02.seongbin;

import java.util.Scanner;

public class Solution_BOJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scores = new int[N];
        int max = 0;
        for(int i = 0; i < N; i++){
            scores[i] = sc.nextInt();
            if(scores[i] > max) {
                max = scores[i];
            }
        }
        double sum = 0;
        for(int score : scores){
            sum += (double)score/max * 100;
        }
        System.out.println(sum / N);
    }
}
