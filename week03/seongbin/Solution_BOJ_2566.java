package week03.seongbin;

import java.util.Scanner;

public class Solution_BOJ_2566 {
    public static void main(String[] args) {
        int[][] numbers = new int[9][9];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                int num = sc.nextInt();
                numbers[i][j] = num;
            }
        }
        int max = -1;
        int maxRow = 0;
        int maxCol = 0;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(numbers[i][j] >= max) {
                    max = numbers[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);
    }
}
