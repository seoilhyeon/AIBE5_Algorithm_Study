package week05.anhyeon;

import java.util.Scanner;

public class Solution_BOJ_1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String s = sc.nextLine();

            if (s.equals("0")) {
                break;
            }

            StringBuffer sb = new StringBuffer(s);
            String rs = sb.reverse().toString();

            if (s.equals(rs)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

            sc.close();
        }
    }
}
