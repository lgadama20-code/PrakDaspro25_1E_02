package P6;
import java.util.Scanner;

public class SiakadWhile02 {
    public static void main(String[] args) {
        
        int nilai02, jml02, i = 0;

        Scanner agung = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        jml02 = agung.nextInt();

        while (i < jml02) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i+1) + (" : "));
            nilai02 = agung.nextInt();

            if (nilai02 < 0 || nilai02 > 100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }
            if (nilai02 > 80 && nilai02 <= 100) {
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " adalah A");
            } else if (nilai02 > 73 && nilai02 <= 80) {
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " adalah B+");
            } else if (nilai02 > 65 && nilai02 <= 73) {
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " adalah B");
            } else if (nilai02 > 60 && nilai02 <= 65) {
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " adalah C+");
            } else if (nilai02 > 50 && nilai02 <= 60) {
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " adalah C");
            } else if (nilai02 > 39 && nilai02 <= 50) {
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke- " + (i+1) + " adalah E");
            }

            i++;
        }

    }
}
