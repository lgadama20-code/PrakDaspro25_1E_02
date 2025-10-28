package P6;
import java.util.Scanner;

public class KafeDoWhile02 {
    public static void main(String[] args) {

        int kopi02, teh02, roti02;
        String namaPelanggan02;
        int hargaKopi02 = 12000, hargaTeh02 = 7000, hargaRoti02 = 20000;
        int totalHarga02;

        Scanner agung = new Scanner(System.in);

        do {
            System.out.print("Masukkan nama pelanggan (Ketik 'batal' untuk keluar) : ");
            namaPelanggan02 = agung.nextLine();
            if (namaPelanggan02.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Jumlah Kopi : ");
            kopi02 = agung.nextInt();
            System.out.print("Jumlah Teh : ");
            teh02 = agung.nextInt();
            System.out.print("Jumlah Roti : ");
            roti02 = agung.nextInt();

            totalHarga02 = (kopi02*hargaKopi02) + (teh02*hargaTeh02) + (roti02*hargaRoti02);
            System.out.println("Total yang harus dibayar : Rp " + totalHarga02);
            agung.nextLine();
        } while (true);
            System.out.println("Semua Transaksi Selesai.");
    }
}
