package week06.seongjae;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ25206_너의평점은 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0.0;
        double totalCredit = 0;
        double grade = 0.0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String score = st.nextToken();

            if (score.equals("P")) continue;    //P 아예 제외

            if (score.equals("A+")) grade = 4.5;
            else if (score.equals("A0")) grade = 4.0;
            else if (score.equals("B+")) grade = 3.5;
            else if (score.equals("B0")) grade = 3.0;
            else if (score.equals("C+")) grade = 2.5;
            else if (score.equals("C0")) grade = 2.0;
            else if (score.equals("D+")) grade = 1.5;
            else if (score.equals("D0")) grade = 1.0;
            else if (score.equals("F")) grade = 0.0;

            sum += credit * grade;
            totalCredit += credit;
        }

        System.out.println(sum / totalCredit);
    }
}