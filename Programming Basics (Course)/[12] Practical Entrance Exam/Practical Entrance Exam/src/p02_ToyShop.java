import java.util.Scanner;

public class p02_ToyShop {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double tripPrice = Double.parseDouble(console.nextLine());
        int puzzlesNumber = Integer.parseInt(console.nextLine());
        int talkingDollsNumber = Integer.parseInt(console.nextLine());
        int teddyBearsNumber = Integer.parseInt(console.nextLine());
        int mignonNumber = Integer.parseInt(console.nextLine());
        int trucksNumber = Integer.parseInt(console.nextLine());

        double puzzlePrice = 2.6;
        double talkingDollsPrice = 3;
        double teddyBearsPrice = 4.1;
        double mignonPrice = 8.2;
        double trucksPrice = 2;

        double discount = 0;

        if((puzzlesNumber + talkingDollsNumber + teddyBearsNumber + mignonNumber + trucksNumber) >= 50) {
            discount = 0.25;
        }

        double monthlyRent = 0.1;

        double totalMoney = (puzzlesNumber * puzzlePrice) + (talkingDollsNumber * talkingDollsPrice) + (teddyBearsNumber * teddyBearsPrice) + (mignonNumber * mignonPrice) + (trucksNumber * trucksPrice);

        totalMoney -= (totalMoney * discount);
        totalMoney -= (totalMoney * monthlyRent);

        if(totalMoney >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", totalMoney - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - totalMoney);
        }
    }
}