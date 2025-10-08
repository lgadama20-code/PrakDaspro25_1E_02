package Jobsheet5;
import java.util.Scanner;

public class ifCetakKRS02 {
    public static void main(String[] args) {

        boolean uktLunas02;

        Scanner agung =  new Scanner(System.in);
        
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false) : ");
        uktLunas02 = agung.nextBoolean();

        if (uktLunas02) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        }

    }
}
