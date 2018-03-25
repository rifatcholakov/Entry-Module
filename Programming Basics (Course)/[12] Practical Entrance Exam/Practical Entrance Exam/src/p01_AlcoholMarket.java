import java.util.Scanner;

public class p01_AlcoholMarket {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(console.nextLine());
        double beerQuantity = Double.parseDouble(console.nextLine());
        double wineQuantity = Double.parseDouble(console.nextLine());
        double rakiQuantity = Double.parseDouble(console.nextLine());
        double whiskeyQuantity = Double.parseDouble(console.nextLine());

        double rakiPrice = whiskeyPrice / 2;
        double winePrice = rakiPrice - (rakiPrice * 0.4);
        double beerPrice = rakiPrice - (rakiPrice * 0.8);

        double moneyNeeded = (winePrice * wineQuantity) + (beerPrice * beerQuantity) + (whiskeyPrice * whiskeyQuantity) + (rakiPrice * rakiQuantity);

        System.out.printf("%.2f", moneyNeeded);
    }
}
