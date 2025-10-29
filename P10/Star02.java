package P10;
import java.util.Scanner;

public class Star02 {
    public static void main(String[] args) {
        
        int n;
        Scanner agung = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        n = agung.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(" * ");
        }
    }
}
