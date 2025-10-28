package P6;
import java.util.Scanner;

public class tempatParkir {
    public static void main(String[] args) {
        
        int jenisKendaraan02, durasiKendaraan02 = 0;
        double totalKeseluruhan02 = 0;

        Scanner agung = new Scanner(System.in);

        
        while (true) {
            System.out.print("Jenis Kendaraan (1=Motor, 2=mobil) : ");
            jenisKendaraan02 = agung.nextInt();

            if (jenisKendaraan02 == 0) {  
                break;
            }

            System.out.print("Durasi parkir (Jam) : ");
            durasiKendaraan02 = agung.nextInt();
            
            int bayar02 = 0;

            if (durasiKendaraan02 > 5) {
                bayar02 = 12500;
            } else if (jenisKendaraan02 == 1) {
                bayar02 = durasiKendaraan02 * 2000;
            } else if (jenisKendaraan02 == 2) {
                bayar02 = durasiKendaraan02 * 3000;
            } else {
                continue;
            }

            System.out.println("Tarif Parkir Anda : " + bayar02);
            
            totalKeseluruhan02 += bayar02;
        }

        System.out.println("Total keseluruhan pembayaran parkir : " + totalKeseluruhan02);
    }
}
