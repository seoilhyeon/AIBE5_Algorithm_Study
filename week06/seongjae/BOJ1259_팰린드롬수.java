package week06.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1259_팰린드롬수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String word = br.readLine();
            if (word.equals("0")) break;

            int left = 0;
            int right = word.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            System.out.println(isPalindrome ? "yes" : "no");
        }
    }


}
