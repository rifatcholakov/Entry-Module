import java.util.Scanner;

public class p08_TradeComissions {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String city = console.nextLine();
        double sales = Double.parseDouble(console.nextLine());

        double percentage = 0;

        switch (city) {
            case "Sofia":
                if(sales >= 0 && sales <= 500) {
                    percentage = 0.05;
                } else if(sales > 500 && sales <= 1000) {
                    percentage = 0.07;
                } else if(sales > 1000 && sales <= 10000) {
                    percentage = 0.08;
                } else  if(sales > 10000) {
                    percentage = 0.12;
                } else {
                    System.out.println("error");
                    return;
                }
                break;

            case "Varna":
                if(sales >= 0 && sales <= 500) {
                    percentage = 0.045;
                } else if(sales > 500 && sales <= 1000) {
                    percentage = 0.075;
                } else if(sales > 1000 && sales <= 10000) {
                    percentage = 0.10;
                } else  if(sales > 10000) {
                    percentage = 0.13;
                } else {
                    System.out.println("error");
                    return;
                }
                break;

            case "Plovdiv":
                if(sales >= 0 && sales <= 500) {
                    percentage = 0.055;
                } else if(sales > 500 && sales <= 1000) {
                    percentage = 0.08;
                } else if(sales > 1000 && sales <= 10000) {
                    percentage = 0.12;
                } else  if(sales > 10000) {
                    percentage = 0.145;
                } else {
                    System.out.println("error");
                    return;
                }
                break;

            default:
                System.out.println("error");
                return;
        }

        double commission = sales * percentage;

        System.out.printf("%.2f", commission);
    }
}