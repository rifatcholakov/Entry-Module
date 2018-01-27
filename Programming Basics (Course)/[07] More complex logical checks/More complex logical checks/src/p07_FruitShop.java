import java.util.Scanner;

public class p07_FruitShop {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String product = console.nextLine();
        String day = console.nextLine();
        double quantity = Double.parseDouble(console.nextLine());

        double price = 0;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (product) {
                    case "banana":
                        price = 2.5 * quantity;
                        break;

                    case  "apple":
                        price = 1.2 * quantity;
                        break;

                    case "orange":
                        price = 0.85 * quantity;
                        break;

                    case "grapefruit":
                        price = 1.45 * quantity;
                        break;

                    case "kiwi":
                        price = 2.7 * quantity;
                        break;

                    case "pineapple":
                        price = 5.5 * quantity;
                        break;

                    case "grapes":
                        price = 3.85 * quantity;
                        break;

                    default:
                        System.out.println("error");
                        return;
                }
                break;

            case "Saturday":
            case "Sunday":
                switch (product) {
                    case "banana":
                        price = 2.7 * quantity;
                        break;

                    case  "apple":
                        price = 1.25 * quantity;
                        break;

                    case "orange":
                        price = 0.9 * quantity;
                        break;

                    case "grapefruit":
                        price = 1.6 * quantity;
                        break;

                    case "kiwi":
                        price = 3.0 * quantity;
                        break;

                    case "pineapple":
                        price = 5.6 * quantity;
                        break;

                    case "grapes":
                        price = 4.2 * quantity;
                        break;

                    default:
                        System.out.println("error");
                        return;
                }
                break;

            default:
                System.out.println("error");
                return;
        }

        System.out.println(price);
    }
}