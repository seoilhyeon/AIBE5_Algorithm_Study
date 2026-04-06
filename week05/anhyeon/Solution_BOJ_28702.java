package week05.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_28702 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;

        for (int i = 0; i < 3; i++) {
            String s = sc.nextLine();

            if (!s.equals("Fizz") && !s.equals("Buzz") && !s.equals("FizzBuzz")) {
                n = Integer.parseInt(s) + (3 - i);
            }
        }

        if (n % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Fizz");
        } else if (n % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }

        sc.close();
    }
}
