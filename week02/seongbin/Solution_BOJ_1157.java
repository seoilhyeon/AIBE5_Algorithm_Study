package week02.seongbin;

import java.util.Scanner;

public class Solution_BOJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String word = input.toUpperCase();
        int[] count = new int[26];

        for(int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'A']++;
        }
        int max = -1;
        char result = '?';
        for(int i = 0; i < count.length; i++) {
            if(count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if(count[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);

    }
}
