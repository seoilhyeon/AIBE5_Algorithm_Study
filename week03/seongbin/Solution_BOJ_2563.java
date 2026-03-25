package week03.seongbin;

import java.util.Scanner;

public class Solution_BOJ_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[][] paper = new boolean[100][100];
        int count = sc.nextInt();

        for(int i = 0; i < count; i++) {
            int positionX = sc.nextInt();
            int positionY = sc.nextInt();

            for(int dx = 0; dx < 10; dx++) {
                for(int dy = 0; dy < 10; dy++) {
                    paper[positionX + dx][positionY + dy] = true;
                }
            }
        }
        int area = 0;
        for(int i = 0; i < paper.length; i++) {
            for(int j = 0; j < paper[0].length; j++) {
                if(paper[i][j]) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}
