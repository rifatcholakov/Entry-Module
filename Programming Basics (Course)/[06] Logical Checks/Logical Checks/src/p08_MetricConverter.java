import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p08_MetricConverter {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        double conversionNumber = Double.parseDouble(br.readLine());
        String inputUnit = br.readLine();
        String outputUnit = br.readLine();

        double meters = 0;

        switch (inputUnit) {
            case "m":
                meters = conversionNumber;
                break;

            case "mm":
                meters = conversionNumber / 1000.0;
                break;

            case "cm":
                meters = conversionNumber / 100.0;
                break;

            case "mi":
                meters = conversionNumber / 0.000621371192;
                break;

            case "in":
                meters = conversionNumber / 39.3700787;
                break;

            case "km":
                meters = conversionNumber / 0.001;
                break;

            case "ft":
                meters = conversionNumber / 3.2808399;
                break;

            case "yd":
                meters = conversionNumber / 1.0936133;
                break;
        }

        double output = 0;

        switch (outputUnit) {
            case "m":
                output = meters;
                break;

            case "mm":
                output = meters * 1000.0;
                break;

            case "cm":
                output = meters * 100.0;
                break;

            case "mi":
                output = meters * 0.000621371192;
                break;

            case "in":
                output = meters * 39.3700787;
                break;

            case "km":
                output = meters * 0.001;
                break;

            case "ft":
                output = meters * 3.2808399;
                break;

            case "yd":
                output = meters * 1.0936133;
                break;
        }

        System.out.printf("%f %s", output, outputUnit);
    }
}