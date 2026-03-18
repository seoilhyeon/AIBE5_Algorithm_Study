package week02.seongbin;

import java.util.Scanner;

public class Solution_BOJ_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalCredit = 0;
        double totalScore = 0;
        for(int i = 0; i < 20; i++) {
            String subject = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();

            if(grade.equals("P")) {
                continue;
            }
            totalCredit += credit;
            if(grade.equals("A+")) {
                totalScore += credit * 4.5;
            }else if(grade.equals("A0")) {
                totalScore += credit * 4.0;
            } else if(grade.equals("B+")) {
                totalScore += credit * 3.5;
            } else if(grade.equals("B0")) {
                totalScore += credit * 3.0;
            } else if(grade.equals("C+")) {
                totalScore += credit * 2.5;
            } else if(grade.equals("C0")) {
                totalScore += credit * 2.0;
            } else if(grade.equals("D+")) {
                totalScore += credit * 1.5;
            } else if(grade.equals("D0")) {
                totalScore += credit;
            } else if(grade.equals("F")) {
                totalScore += 0;
            }
        }
        System.out.println(totalScore / totalCredit);
    }
}
