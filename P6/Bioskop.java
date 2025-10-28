package P6;
import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        
       int tiket02, hargaTiket02 = 50000, jumlahTiket02 = 0;
       double jumlahHarga02 = 0;
       String pelanggan02 = "";

       Scanner agung = new Scanner(System.in);

       do {
        System.out.print("Masukkan jumlah tiket : ");
        tiket02 = agung.nextInt();
        agung.nextLine();

        if (tiket02 < 0) {
            System.out.println("Jumlah tidak boleh negatif! Masukkan ulang!");
            continue;
        }

        double diskon02 = 0, hargaAwal02, hargaDiskon02, hargaTotal02;

        if (tiket02 > 10) {
            diskon02 = 0.15;
        } else if (tiket02 > 4) {
            diskon02 = 0.10;
        }

        
        hargaAwal02 = tiket02 * hargaTiket02;
        hargaDiskon02 = hargaAwal02 * diskon02;
        hargaTotal02 = hargaAwal02 - hargaDiskon02;
        
        System.out.println("Diskon Anda : " + diskon02 + ("%"));
        System.out.println("Total harga : " + hargaTotal02);

        jumlahTiket02 += tiket02;
        jumlahHarga02 += hargaTotal02;

        System.out.print("Apakah ada pelanggan lagi? (Ya/Tidak) : ");
        pelanggan02 = agung.nextLine();

       } while (pelanggan02.equalsIgnoreCase("ya"));
            System.out.println("Total tiket terjual hari ini : " + jumlahTiket02);
            System.out.println("Total Penjualan tiket : " + jumlahHarga02);

        agung.close();

    }
}
