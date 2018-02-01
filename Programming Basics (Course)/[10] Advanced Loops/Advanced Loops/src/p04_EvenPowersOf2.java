import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p04_EvenPowersOf2 {

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(console.readLine());

        int num = 1;

        for (int i = 0; i <= n; i += 2) {
            System.out.println(num);

            num *= 4;
        }
    }
}