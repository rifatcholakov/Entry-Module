import java.util.Scanner;

public class p02_SmallShop {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String product = console.nextLine();
        String city = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());

        double price = 0;

        switch (city) {
            case "Sofia":
                switch (product) {
                    case "coffee":
                        price = 0.5 * quantity;
                        break;

                    case "water":
                        price = 0.8 * quantity;
                        break;

                    case "beer":
                        price = 1.2 * quantity;
                        break;

                    case "sweets":
                        price = 1.45 * quantity;
                        break;

                    case "peanuts":
                        price = 1.6 * quantity;
                        break;
                }
                break;

            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        price = 0.4 * quantity;
                        break;

                    case "water":
                        price = 0.7 * quantity;
                        break;

                    case "beer":
                        price = 1.15 * quantity;
                        break;

                    case "sweets":
                        price = 1.30 * quantity;
                        break;

                    case "peanuts":
                        price = 1.5 * quantity;
                        break;
                }
                break;

            case "Varna":
                switch (product) {
                    case "coffee":
                        price = 0.45 * quantity;
                        break;

                    case "water":
                        price = 0.7 * quantity;
                        break;

                    case "beer":
                        price = 1.1 * quantity;
                        break;

                    case "sweets":
                        price = 1.35 * quantity;
                        break;

                    case "peanuts":
                        price = 1.55 * quantity;
                        break;
                }
                break;
        }

        System.out.println(price);
    }
}