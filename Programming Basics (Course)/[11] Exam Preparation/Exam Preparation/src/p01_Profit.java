import java.util.Scanner;

public class p01_Profit {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());
        double money = Double.parseDouble(console.nextLine());
        double dollarRate = Double.parseDouble(console.nextLine());

        double monthSalary = days * money;
        double moneyPerYear = monthSalary * 12 + monthSalary * 2.5;
        double moneyAfterTaxes = moneyPerYear - 25 * moneyPerYear / 100;

        double averageMoney = moneyAfterTaxes * dollarRate / 365;

        System.out.printf("%.2f", averageMoney);
    }
}