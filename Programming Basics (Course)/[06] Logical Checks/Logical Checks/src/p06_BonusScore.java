import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class p06_BonusScore {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        NumberFormat numberFormat = new DecimalFormat("##.###");

        int score = Integer.parseInt(console.nextLine());
        double bonusScore = 0;

        if(score > 1000) {
            bonusScore = score * 0.1;
        } else if (score > 100) {
            bonusScore = score * 0.2;
        } else if (score <= 100) {
            bonusScore = 5;
        }

        if(score % 2 == 0) {
            bonusScore++;
        }

        if(score % 10 == 5) {
            bonusScore += 2;
        }

        System.out.println(numberFormat.format(bonusScore));
        System.out.println(numberFormat.format(score + bonusScore));
    }
}