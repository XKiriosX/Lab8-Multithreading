import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter size of ur array:");
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int length = Integer.parseInt(bf.readLine());
            Thread arr = new Arr(length);
            arr.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
