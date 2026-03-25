package week03.seongbin;

import java.util.Scanner;

public class Solution_BOJ_10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        int max = 0;

        for(int i = 0; i < words.length; i++) {
            words[i] = sc.nextLine();
            max = Math.max(max, words[i].length());
        }

        StringBuffer sb = new StringBuffer();
        for(int j = 0; j < max; j++) {
            for(int i = 0; i < words.length; i++) {
                if(j < words[i].length()) {
                    sb.append(words[i].charAt(j));
                }
            }
        }
        System.out.println(sb);
    }
}
