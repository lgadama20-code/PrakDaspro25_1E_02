package P6;

import java.util.Scanner;

public class Akses_wifi {
    public static void main(String[] args) {
        
        String pengguna;
        int SKS;
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nama pengguna: ");
        pengguna = sc.nextLine();

        if (pengguna.equalsIgnoreCase("dosen")) {
            System.out.println("akses diterima");
        } else if (pengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.println("masukkan SKS");
            SKS = sc.nextInt();
            if (SKS > 12) {
                System.out.println("Akses diterima");
            } else {
                System.out.println("akses ditolak");
            }
        }
    }
}
