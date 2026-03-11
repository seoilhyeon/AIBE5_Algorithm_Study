package week02.seongbin;

import java.util.Scanner;

public class Solution_BOJ_2562 {
    public static void main(String[] args) {
        int[] numbers = new int[9];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int max = 0;
        int maxPosition = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
                maxPosition = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(maxPosition);
    }
}
